package application.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

/**
 * @autor: Boris Perez
 **/
public class Ask {

    /**
     * Is the action is boolean methods
     */
    public static Boolean isPresent(Target target, Actor actor) {
               isVisible(target);
        return Presence.of(target).viewedBy(actor).resolve();
    }

    /**
     * Is the action is boolean methods
     */
    public static WaitUntilTargetIsReady isVisible(Target target) {
        return WaitUntil.the(target, isCurrentlyVisible());
    }

    /**
     * Is the action is boolean methods
     */
    public static String isTextPresent(Target target, Actor actor) {
        return Text.of(target).viewedBy(actor).resolve();
    }

    /**
     * Add a wait
     */
    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            throw new UnsupportedOperationException("Unable to add a sleep");
        }
    }

    public static void sleepUploadFile() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            throw new UnsupportedOperationException("Unable to add a sleep");
        }
    }

}
