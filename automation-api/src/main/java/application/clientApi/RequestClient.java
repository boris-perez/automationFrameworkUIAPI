package application.clientApi;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

/**
 * @autor: Boris.Perez
 **/
public abstract class RequestClient {

    public RequestSpecification requestSpec = SerenityRest.given();
    public RequestSpecification request;
    public Response response = null;

}
