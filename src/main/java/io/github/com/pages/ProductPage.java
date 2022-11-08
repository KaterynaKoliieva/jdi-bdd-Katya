package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends WebPage {

    @UI("#product_add_button_412XT") public static Button deliverButton;
    @UI("#continue_button_btn") public static Button continueShoppingButton;
    @UI("#add_for_collection_button_268FX") public static Button clickAndCollectButton;
    @FindBy(xpath = "//h3[@class='lii__title']") public static List<WebElement> headerNames;



}
