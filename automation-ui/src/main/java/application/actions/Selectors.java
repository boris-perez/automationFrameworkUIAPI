package application.actions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @author Boris Perez
 */

/**
 * This class contains common UI Methods that are used in Serenity
 */
public class Selectors {

    /**
     * Is the action to select a locator by ID
     */
    public static Target byID(String constant, String name) {
        return Target.the(name).located(By.id(constant));
    }

    /**
     * Is the action to select a locator by ID
     */
    public static Target byCSS(String constant, String name) {
        return Target.the(name).located(By.cssSelector(constant));
    }

    /**
     * Is the action to select a locator by ID
     */
    public static Target byXpath(String constant, String name) {
        return Target.the(name).located(By.xpath(constant));
    }

}
