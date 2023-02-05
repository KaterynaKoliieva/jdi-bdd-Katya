package cucumberTests.stepdefs;

import cucumber.api.java.en.And;
import io.github.com.entities.Users;

import java.util.Locale;

import static io.github.com.entities.Users.randomEmail;
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

    @And("^input random email$")
    public void inputRandomEmail() {
        String email = randomEmail();
        //Allure.addAttachment("Email: ", email);
        emailField.sendKeys(email);
    }

}