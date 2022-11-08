@Authentication
Feature: Authentication

  Background: Login to the site
    Given I'm on "LogInPage"
    And submit form "Login Form" with "UserData"

  @LogInTest
  Scenario: Check the login of a registered user to the site
    Then the "//span[@class='user-name']" text equals to "1660074366230cucumber 1660074366230cucumber"

  @LogOutTest
  Scenario: Check the logout of the registered user from the site
    And click on "//li[@class='acc']//span[@class='user-name']"
    When click on "#header_link_sign_out"
    Then the "//li[@class='acc']//span[@class='user-name']" text contains "Sign in / Register"





