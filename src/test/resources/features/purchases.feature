@Purchases
Feature: Purchases

  Background: Registration of a new user
    Given I'm on "LogInPage"
    When click on "//button[contains(@class,'id-register-button')]"
    And input random email
    And click on "#continueRegistrationButton"
    And choose Title
    And input "Cucumber" in "#firstName"
    And input "Onion" in "#lastName"
    And choose Profession
    And input "E1 6AN" in "#contact-search-postcode"
    And click on "//button[contains(@class,'id-find-address-button')]"
    And selects Address
    And input "OnionOnion2022" in "#password"
    And input "OnionOnion2022" in "#retypePassword"
    And click on "//button[@class='btn btn--primary fill btn--xl']"
    And click on "//a[contains(@class,'btn--primary sm-fill')]"

  @RegistrationTest
  Scenario: Check the registration of a new user
    Then the "//span[@class='user-name']" text equals to "Cucumber Onion"

  @ShoppingCartTest
  Scenario: Check the shopping cart
    Given input "drills" in "#mainSearch-input"
    And click on "#search_submit_button"
    And click on "#product_add_button_412XT"
    And click on "#continue_button_btn"
    And click on "#add_for_collection_button_268FX"
    And click on "#checkout_now"
#    And input "BA22 8RT" in "#search_branch_textbox"
#    And click on "#search_branch_button"
#    And click on "#add_for_collection_button_1"
#    And click on "//button[@class='lb-btn-cancel']"
#    And click on "//a[@href='/jsp/trolley/trolleyPage.jsp?reprice=true']"
    And User checks if the Delivery button is selected for the first product
    And User checks if the Click And Collect button is selected for the second product
    And User checks Sub Total Field
    And the "#trolley_page_delivery" text equals to "FREE"
    And User checks if the Total Field is the same as the Sub Total Field



