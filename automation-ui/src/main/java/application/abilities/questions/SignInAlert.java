package application.abilities.questions;


import application.actions.Ask;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static application.ui.BugzComponent.signAlert;

/**
 * @author Boris Perez
 */
public class SignInAlert implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Ask.isPresent(signAlert, actor);
    }

    public static Question<Boolean> IsPresent() {
        return Instrumented.instanceOf(SignInAlert.class).withProperties();
    }

}
