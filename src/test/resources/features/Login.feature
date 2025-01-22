@login @regression
Feature: WebDriver University - Login

  Background:
    Given I can access WebDriver university website

  Scenario Outline: Validate - Unsuccessful and Unsuccessful Login

    When I enter a username <username>
    And I enter a password <password>
    And I click on login
    Then I should be presented with the following login message <login message>

    Examples:
      | username  | password     | login message        |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver1   | validation failed    |
      | joe_blogs | password1    | validation failed    |