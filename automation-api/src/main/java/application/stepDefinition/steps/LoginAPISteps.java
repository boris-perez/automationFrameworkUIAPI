package application.stepDefinition.steps;

import application.clientApi.RequestBuilder;
import application.clientApi.RequestClient;
import application.dto.request.LoginRequest;
import application.dto.response.LoginResponse;
import io.restassured.path.json.JsonPath;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginAPISteps extends RequestClient {

    private LoginRequest loginRequest = new LoginRequest();
    private LoginResponse loginResponse = new LoginResponse();
    private JsonPath jsonPath;

    @Step
    public void givenUserDetails(String username, String password) {
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        loginRequest.setVersion("0.0.0");

        RequestBuilder builder = new RequestBuilder();
        builder.setBasePath("/Login");
        builder.setContentType("application/json");
        builder.addHeader("transactionId", "FB-1234567-12345678-0001");
        builder.addHeader("X-TENANT-ID", "dhin");
        builder.setBody(loginRequest);
        request = builder.build();
        request = requestSpec.given().spec(request);
        request.log().all();
    }

    @Step
    public void postLoginRequest() {
        response = request.when().post();
    }

    @Step
    public void verifyLoginSuccess() {
        loginResponse = response.as(LoginResponse.class);
        Assert.assertEquals("Status Check Failed!", 200, response.getStatusCode());
        Assert.assertNotNull(loginResponse.getAccessToken());
        Assert.assertNotNull(loginResponse.getRefreshToken());
        Assert.assertNotNull(loginResponse.getRole());
        Assert.assertNotNull(loginResponse.getStatus());
        Assert.assertNotNull(loginResponse.getUserEmail());
        Assert.assertNotNull(loginResponse.getUserId());
        Assert.assertNotNull(loginResponse.getUserName());
    }

    @Step
    public void verifyLoginFailure() {
        jsonPath = response.jsonPath();
        Assert.assertEquals("Invalid user credentials allowed", 500, response.getStatusCode());
        Assert.assertEquals("Message Code incorrect", "1002", jsonPath.get("statusCode"));
    }
}


