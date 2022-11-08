package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import io.github.com.sections.AddressForm;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationPage extends WebPage {
    @UI("//input[@id='email-input']") public static TextField emailField;
    @UI("//button[@id='continueRegistrationButton']") public Button continueButton;
    @UI("//select[@id='newTitle']/option") public static List<WebElement> selectTitleButton;
    @UI("//select[@id='profession']/option") public static List<WebElement> selectProfessionButton;
    @UI("//select[contains(@id,'contact-address')]/option") public static List<WebElement> selectAddressButton;
    @Css("#addressSearchForm") public static AddressForm addressForm;
    @FindBy(xpath = "//a[contains(@class,'btn--primary sm-fill')]")  public static WebElement continueShoppingButton;
}
