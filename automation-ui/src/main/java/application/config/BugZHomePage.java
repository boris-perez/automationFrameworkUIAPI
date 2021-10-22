package application.config;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

@DefaultUrl("page:home.page")
public class BugZHomePage extends PageObject {

    @Managed(uniqueSession = true)
    private WebDriver _driver = null;
}
