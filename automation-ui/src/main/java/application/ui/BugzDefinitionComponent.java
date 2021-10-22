package application.ui;


import application.actions.Selectors;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static application.ui.BugzConstants.*;


/**
 * @author Boris Perez
 */

public class BugzDefinitionComponent extends PageObject {

    public static final Target bugTitle = Selectors.byXpath(BUG_TITLE, "Title");
    public static final Target bugDescription = Selectors.byXpath(BUG_DESCRIPTION, "Description");
    public static final Target bugSaveOption = Selectors.byXpath(BUG_SAVE_BUTTON, "Save option");
}
