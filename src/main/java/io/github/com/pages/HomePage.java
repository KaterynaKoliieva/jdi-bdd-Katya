package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage{

    @UI("//div[@class='text-center']") public static WebElement successfullySignIn;
    @UI("//li[@class='acc']//span[@class='user-name']") public Button yourAccountButton;
    @UI("//span[@class='user-name']") public static WebElement signInButton;
    @UI("#header_link_sign_out") public static Button logOutButton;
    @UI("#mainSearch-input") public static TextField searchField;
    @UI("#search_submit_button") public static Button searchButton;

}

