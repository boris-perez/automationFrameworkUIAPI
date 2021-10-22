package application.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

/**
 * @autor: Boris.Perez
 **/
public class BaseStep {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setup() {
        RestAssured.baseURI = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("my.webservice.endpoint");
    }

    @After
    public void tearDown() {
        RestAssured.reset();
    }
}
