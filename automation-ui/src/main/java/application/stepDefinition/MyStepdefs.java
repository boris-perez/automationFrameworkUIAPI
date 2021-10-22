package application.stepDefinition;

import application.abilities.questions.BugList;
import application.abilities.tasks.LoginAction;
import application.abilities.tasks.NavigateTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

/**
 * @autor: Boris.Perez
 **/
public class MyStepdefs {

    @Before
    public void cucumberBeforeScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) enter with (.*) and (.*)$")
    public void theUserEnterWithTeresaAndSesame(String actor, String userName, String password) {
        OnStage.theActorCalled(actor)
                .attemptsTo(NavigateTo.BugZ_Page(),
                        LoginAction.IsSelected(userName, password));
    }

    @Then("^the bug main list is visible$")
    public void theBugMailListIsVisible() {
        OnStage.theActorInTheSpotlight().should(seeThat(BugList.IsPresent()));
    }

    @When("^creates new issue with (.*), (.*)$")
    public void createsNewIssueWithTitleDescription(String title, String description) {
        withCurrentActor(

        );
    }
}
