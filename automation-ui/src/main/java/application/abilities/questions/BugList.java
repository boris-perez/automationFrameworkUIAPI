package application.abilities.questions;


import application.actions.Ask;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static application.ui.BugzComponent.caseList;

/**
 * @author Boris Perez
 */
public class BugList implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Ask.isPresent(caseList, actor);
    }

    public static Question<Boolean> IsPresent() {
        return Instrumented.instanceOf(BugList.class).withProperties();
    }

}
