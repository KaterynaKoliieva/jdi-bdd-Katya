package cucumberTests.stepdefs;

import cucumber.api.java.en.And;
import io.github.com.entities.Contacts;
import io.github.com.entities.Users;

import java.util.Locale;

import static io.github.com.entities.Users.*;
import static io.github.com.pages.BasketPage.*;
import static io.github.com.pages.RegistrationPage.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserStepdefs {
    @And("^input random email in email field$")
    public void iInputRandomNameIn() {
        String email = Users.randomEmail();
        //Allure.addAttachment("Email: ", email);
        emailField.sendKeys(email);
        //input(Users.randomEmail()).input(value);
    }

    @And("^choose Title$")
    public void chooseTitle() throws InterruptedException {
//        Thread.sleep(2000);
//        int rndNumber = randomNumber(selectTitleButton.size());
        int number = 2;
        selectTitleButton.get(number).click();
    }

    @And("^choose Profession$")
    public void chooseProfession() {
//        int rndNumber = randomNumber(selectProfessionButton.size());
        int number = 2;
        selectProfessionButton.get(number).click();
    }

    @And("^selects Address$")
    public void selectsAddress() throws InterruptedException {
//        Thread.sleep(2000);
//        int rndNumber = randomNumber(selectAddressButton.size());
        int number = 2;
        selectAddressButton.get(number).click();
        Thread.sleep(2000);
//        registerNow.click();
    }

    @And("^User checks if the Deliver button is selected for the first product$")
    public void userChecksIfTheDeliveryButtonIsSelectedForTheProduct() {
        assertTrue(selectedDeliverButton.getText().contains("Deliver"));
    }

    @And("^User checks if the Click And Collect button is selected for the second product$")
    public void userChecksIfTheClickAndCollectButtonIsSelectedForTheSecondProduct() {
        assertTrue(selectedClickAndCollectButton.getText().contains("Click"));
    }

    @And("^User checks Sub Total Field$")
    public void userChecksSubTotalField() {
        double firstPrice = Double.parseDouble(totalPriceField1.getText().replace("£", ""));
        double secondPrice = Double.parseDouble(totalPriceField2.getText().replace("£", ""));
        String res_st = String.format(Locale.US, "%.2f", firstPrice+secondPrice);

        assertEquals(Double.parseDouble(subTotalField.getText().replace("£", "")),
                Double.parseDouble(res_st), 0.00);
    }

    @And("^User checks if the Total Field is the same as the Sub Total Field$")
    public void userChecksIfTheTotalFieldIsTheSameAsTheSubTotalField() {
        assertEquals(Double.parseDouble(totalField.getText().replace("£", "")),
                Double.parseDouble(subTotalField.getText().replace("£", "")), 0.00);
    }

    @And("^check email field$")
    public void checkEmailField() throws InterruptedException {
        String withoutAsperandEmail = EMAIL_WITHOUT_ASPERAND.email;
        String registeredUser = DEFAULT_USER.email;

        continueYourRegistration.click();
        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("Please enter an email address"));

        emailField.sendKeys(registeredUser);
        continueYourRegistration.click();
        Thread.sleep(1000);
        assertTrue(infoboxText.getText().contains("Sorry, we cannot register you"));
        emailField.clear();

        Thread.sleep(1000);
        emailField.sendKeys(withoutAsperandEmail);
        continueYourRegistration.click();
        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("Email address is missing the '@' symbol"));
        emailField.clear();
    }

    @And("^input random email$")
    public void inputRandomEmail() throws InterruptedException {
        String email = randomEmail();
        Thread.sleep(2000);
        emailField.sendKeys(email);
    }

    @And("^check when all fields are empty$")
    public void checkWhenAllFieldsAreEmpty() throws InterruptedException {
        Thread.sleep(1000);
        registerNow.click();
        Thread.sleep(1000);

        assertTrue(messageErrorList.get(0).getText().contains("Please choose your title"));
        assertTrue(messageErrorList.get(1).getText().contains("Please enter your first name"));
        assertTrue(messageErrorList.get(2).getText().contains("Please enter your last name"));
        assertTrue(messageErrorList.get(3).getText().contains("Please choose your profession"));
        assertTrue(messageErrorList.get(4).getText().contains("Please enter a postcode"));
        assertTrue(messageErrorList.get(5).getText().contains("not enough characters"));
        assertTrue(messageErrorList.get(6).getText().contains("Please re-enter your password"));
    }
    @And("^wait a second$")
    public void waitASecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("^check postcode section$")
    public void checkPostcodeSection() throws InterruptedException {
        String password = Contacts.password;
        passwordField.sendKeys(password);
        retypePassword.sendKeys(password);
        registerNow.click();
        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("Please enter your address"));
        findAddress.click();
        registerNow.click();

        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("Please enter your address"));
    }

    @And("^check password section$")
    public void checkPasswordSection() throws InterruptedException {
        passwordField.clear();
        retypePassword.clear();

        passwordField.sendKeys(passwordLessTnan8);
        registerNow.click();
        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("not enough characters"));
        passwordField.clear();

        passwordField.sendKeys(defaultPassword);
        retypePassword.sendKeys(passwordLessTnan8);
        registerNow.click();
        Thread.sleep(1000);
        assertTrue(messageError.getText().contains("Your passwords do not match, please try again"));
        passwordField.clear();
        retypePassword.clear();

        passwordField.sendKeys(defaultPassword);
        registerNow.click();
        assertTrue(messageError.getText().contains("Please re-enter your password"));
        passwordField.clear();
    }

}