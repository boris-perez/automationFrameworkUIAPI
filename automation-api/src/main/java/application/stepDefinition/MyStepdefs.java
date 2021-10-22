package application.stepDefinition;

import application.stepDefinition.steps.LoginAPISteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ReadExcelFile;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

/**
 * @autor: Boris.Perez
 **/
public class MyStepdefs {

    private ReadExcelFile readFile;

    @Steps
    LoginAPISteps loginAPI;

    @Given("^the user enter with (.*) and (.*)$")
    public void login_with_username_and_password(String userName, String password) {
        loginAPI.givenUserDetails(userName, password);
    }

    @When("^send a POST request$")
    public void send_Request() {
        loginAPI.postLoginRequest();
    }

    @Then("^the login is (.*)$")
    public void the_Login_Status(String Status) {
        if (Status.equals("failed")) {
            loginAPI.verifyLoginFailure();
        } else {
            loginAPI.verifyLoginSuccess();
        }
    }

    @Then("^the (.*) is displayed$")
    public void the_Status_IsDisplayed() {
    }

    @Given("^the user enter userName and Password$")
    public void the_User_Enter_UserName_Password() throws IOException {
        readFile = new ReadExcelFile();
        String filepath = "src/test/resources/dataDriven.xlsx";
        String userName = readFile.getCellValue(filepath, "Sheet1", 1, 0);
        String password = readFile.getCellValue(filepath, "Sheet1", 1, 1);

        loginAPI.givenUserDetails(userName, password);
    }
}
