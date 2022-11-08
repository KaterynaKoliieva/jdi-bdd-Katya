package io.github.com;

import com.epam.jdi.light.elements.pageobjects.annotations.Frame;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import io.github.com.pages.*;

@JSite("https://www.screwfix.com/")
public class StaticSite {

    @Url("/login") @Title ("Login Form") public static LogInPage logInPage;

    @Url("/") @Title("HomePage")
    public static HomePage homePage;

    @Url("/registration") @Title ("Address Form") public static RegistrationPage registrationPage;

    @Frame("//iframe[@class='truste_popframe']") public static LoginPageFrame iframe;

    //write url
    @Url("/") @Title ("ProductPage") public static ProductPage productPage;
    @Url("/") @Title ("CheckStockPage") public static CheckStockPage checkStockPage;
    @Url("/") @Title("BasketPage") public static BasketPage basketPage;



}


