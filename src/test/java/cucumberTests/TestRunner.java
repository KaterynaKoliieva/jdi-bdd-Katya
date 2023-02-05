package cucumberTests;

import com.epam.jdi.light.elements.interfaces.complex.IsCombobox;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.com.StaticSite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.InitActions.INTERFACES;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static io.github.com.StaticSite.logInPage;
import static io.github.com.pages.LoginPageFrame.acceptCookiesButton;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features",
        glue = {"com.epam.jdi.bdd", "cucumberTests"},
        plugin = {"pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        tags = "@LogInTest, @LogOutTest, @RegistrationTest, @ShoppingCartTest"
)

public class TestRunner {
    @BeforeClass
    public static void setUp() {
        INTERFACES.update(IsCombobox.class, DataListOptions.class);
        initElements(StaticSite.class);
        logInPage.open();
        logger.toLog("Run Tests");
        acceptCookiesButton.click();
    }

    @AfterClass
    public static void shutDown() {
        killAllSeleniumDrivers();
    }
}
