package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import io.github.com.sections.LoginForm;


public class LogInPage extends WebPage {

    @Css("form") public static LoginForm loginForm;
    @UI("//button[contains(@class,'id-register-button')]") public static Button registerNowButton;
}
