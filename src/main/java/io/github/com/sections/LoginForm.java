package io.github.com.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import io.github.com.entities.User;


public class LoginForm extends Form<User> {

    @UI("#email-existing") TextField email;
    @UI("#password-field") TextField password;
    @UI("#sign-in-btn") Button signInButton;

}
