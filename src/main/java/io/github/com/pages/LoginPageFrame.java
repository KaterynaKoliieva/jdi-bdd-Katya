package io.github.com.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class LoginPageFrame extends Section {
    @UI("//a[@class='call']") public static UIElement acceptCookiesButton;

}
