package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationPage extends WebPage {
    @UI("//input[@id='email-input']") public static TextField emailField;
    @UI("#continueRegistrationButton") public static Button continueYourRegistration;
    @UI("#firstName") public static TextField firstName;
    @UI("#lastName") public static TextField lastName;
    @UI("#contact-search-postcode") public static TextField postcode;
    @UI("#password") public static TextField passwordField;
    @UI("#retypePassword") public static TextField retypePassword;
    @UI("#registerNowButton") public static Button registerNow;
    @UI("//button[@class='btn fill btn--lg id-find-address-button']") public static Button findAddress;
    @UI("//p[@class='fm-item__message--error']") public static WebElement messageError;
    @UI("//p[@class='fm-item__message--error']") public static List<WebElement> messageErrorList;
    @UI("//span[@class='infobox__text']") public static WebElement infoboxText;

    @UI("//button[@id='continueRegistrationButton']") public Button continueButton;
    @UI("//select[@id='newTitle']/option") public static List<WebElement> selectTitleButton;
    @UI("//select[@id='profession']/option") public static List<WebElement> selectProfessionButton;
    @UI("//select[contains(@id,'contact-address')]/option") public static List<WebElement> selectAddressButton;

    @FindBy(xpath = "//a[contains(@class,'btn--primary sm-fill')]")  public static WebElement continueShoppingButton;
}
