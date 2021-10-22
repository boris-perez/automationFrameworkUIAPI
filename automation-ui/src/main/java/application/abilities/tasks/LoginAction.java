package application.abilities.tasks;

import application.actions.Ask;
import application.actions.Click;
import application.actions.EnterValue;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static application.ui.BugzComponent.*;

/**
 * @author Boris Perez
 */
public class LoginAction implements Task {

    private String userName;
    private String password;

    public LoginAction(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterValue.text(userName, userNameOption),
                EnterValue.text(password, passOption),
                Click.on(signInOption)
        );
    }

    public static LoginAction IsSelected(String userName, String password) {
        return Instrumented.instanceOf(LoginAction.class).withProperties(userName, password);
    }
}
