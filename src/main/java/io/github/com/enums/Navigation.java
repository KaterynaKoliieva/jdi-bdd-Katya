package io.github.com.enums;

import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;

/**
 * Created by Roman_Iovlev on 3/2/2018.
 */
public enum Navigation {

    LoginForm("Login Form"),
    AddressForm("Address Form");
    public String value;
    Navigation() { value = toString(); }
    Navigation(String value) { this.value = value; }
}
