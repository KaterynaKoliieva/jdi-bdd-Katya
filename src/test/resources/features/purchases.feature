@Purchases
Feature: Purchases

  Background: Registration of a new user
    Given I'm on "LogInPage"
    And click on "//button[contains(@class,'id-register-button')]"

  @RegistrationTest
  Scenario: Check the registration of a new user
    And check email field
    And input random email
    And click on "#continueRegistrationButton"
    And check when all fields are empty
    And choose Title
    And input "Cucumber" in "#firstName"
    And input "Onion" in "#lastName"
    And choose Profession
    And input "E1 6AN" in "#contact-search-postcode"
    And check postcode section
    And selects Address
    And check password section
    And input "OnionOnion2022" in "#password"
    And input "OnionOnion2022" in "#retypePassword"
    And selects Address
    And wait a second
    And click on "#registerNowButton"
    And wait a second
    And click on "//a[@class='btn btn--primary sm-fill btn--xl']"
    Then the "#username-label" text equals to "Cucumber Onion"
    And click on "//span[@class='TcRU9_ PO7_zG PLOsrp']"
    And click on "//button[@class='DtE_nS noWGnz _oekPp _1f_Trd Y1shPH GGlJ0i A_hF8H']"

  @ShoppingCartTest
  Scenario: Check the shopping cart
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
    When input "drills" in "#keyword-search"
    And click on "//button[@data-qaid='search-button']"
    And click on "//button[@class='DtE_nS UvZo21 Q_KHB7 bTqDYN']"
    And click on "//button[@class='DtE_nS UvZo21 RgZO2i Y1shPH qidZSw JYOZmb']"
    And click on "//button[@class='DtE_nS UvZo21 Q_KHB7 a3MLfX']"
#    And click on "//button[@class='DtE_nS noWGnz RgZO2i Y1shPH qidZSw JYOZmb']"
    And input "BA22 8RT" in "#search_branch_textbox"
    And click on "#search_branch_button"
    And click on "#add_for_collection_button_1"
    And click on "//button[@class='lb-btn-cancel']"
    And click on "//a[@href='/jsp/trolley/trolleyPage.jsp?reprice=true']"
    And User checks if the Deliver button is selected for the first product
    And User checks if the Click And Collect button is selected for the second product
    And User checks Sub Total Field
    And the "#trolley_page_delivery" text equals to "FREE"
    And User checks if the Total Field is the same as the Sub Total Field



