package io.github.com.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import io.github.com.entities.Contacts;

public class AddressForm extends Form<Contacts> {

    //@UI("//select[@id='newTitle']/option") Dropdown title;
    //@UI("#firstName") TextField firstName;
    //@UI("#lastName") TextField lastName;
    //@UI("//select[@id='profession']/option") Dropdown profession;
    @UI("#contact-search-postcode") TextField postcode;
    @UI("//button[contains(@class,'id-find-address-button')]") Button findAddressButton;
    @UI("//select[contains(@id,'contact-address')]/option") Dropdown address;
    //@UI("#password") TextField password;
    //@UI("#retypePassword") TextField retypePassword;
    //@UI("//button[@class='btn btn--primary fill btn--xl']") Button registerNowButton;

}
