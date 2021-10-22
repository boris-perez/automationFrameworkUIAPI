package application.ui;


import application.actions.Selectors;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static application.ui.BugzConstants.*;


/**
 * @author Boris Perez
 */

public class BugzComponent extends PageObject {

    public static final Target userNameOption = Selectors.byXpath(USERNAME_OPTION, "User Name");
    public static final Target passOption = Selectors.byXpath(PASSWORD_OPTION, "Password");
    public static final Target signInOption = Selectors.byXpath(SIGN_IN_BUTTON, "SignIn Button");
    public static final Target signAlert = Selectors.byCSS(SIGN_IN_ALERT, "Sing Alert");
    public static final Target caseList = Selectors.byXpath(CASE_LIST, "List Issue List");
}
