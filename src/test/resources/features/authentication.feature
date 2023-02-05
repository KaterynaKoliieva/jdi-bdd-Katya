@Authentication
Feature: Authentication

  Background: Login to the site
    Given I'm on "LogInPage"

  @LogInTest
  Scenario: Check the login of a registered user to the site

    And submit form "Login Form" with "IncorrectAll"
    And the "//div[@class='infobox__block']" text contains "Your email and/or password is not recognised"
    And clear "#email-existing"
    And clear "#password-field"

    And wait a second
    And submit form "Login Form" with "EmptyPassword"
    And the "//p[@class='fm-item__message--error']" text contains "enter the password"
    And clear "#email-existing"

    And wait a second
    And submit form "Login Form" with "IncorrectPassword"
    And the "//div[@class='infobox__block']" text contains "Your email and/or password is not recognised"
    And clear "#email-existing"
    And clear "#password-field"

    And wait a second
    And submit form "Login Form" with "EmailWithoutAsperand"
    And the "//p[@class='fm-item__message--error']" text contains "Email address is missing the '@' symbol"
    And clear "#email-existing"
    And clear "#password-field"

    And wait a second
    And submit form "Login Form" with "IncorrectEmail"
    And the "//div[@class='infobox__block']" text contains "Your email and/or password is not recognised"
    And clear "#email-existing"

    And wait a second
    And submit form "Login Form" with "EmptyEmail"
    And the "//p[@class='fm-item__message--error']" text contains "enter an email address"
    And clear "#password-field"

    And wait a second
    And submit form "Login Form" with "EmptyFields"
    And the "//p[@class='fm-item__message--error']" text contains "enter an email address"

    And wait a second
    And submit form "Login Form" with "UserData"
    And the "//span[@class='user-name']" text equals to "1660074366230cucumber 1660074366230cucumber"
    And click on "//li[@class='acc']//span[@class='user-name']"
    And click on "#header_link_sign_out"

  @LogOutTest
  Scenario: Check the logout of the registered user from the site
    And submit form "Login Form" with "UserData"
    And click on "//li[@class='acc']//span[@class='user-name']"
    When click on "#header_link_sign_out"
    Then the "//li[@class='acc']//span[@class='user-name']" text contains "Sign in / Register"





