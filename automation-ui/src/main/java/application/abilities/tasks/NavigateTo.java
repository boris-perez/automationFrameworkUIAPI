package application.abilities.tasks;

import application.config.BugZHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.springframework.stereotype.Component;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Component
public class NavigateTo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(BugZHomePage.class));
    }

    public static NavigateTo BugZ_Page() {
        return instrumented(NavigateTo.class);
    }

}
