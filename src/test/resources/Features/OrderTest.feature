@Order
Feature: User should be able to organize Order Page

  Scenario: Organize the Order Page
    Given User is on the login page and acces with credential and click Order menu
    When User should fill Product Information and click Calculate
    And User should fill Address Information and Payment Information then click Reset button
    And user should fill Product Information and click Calculate2
    Then User should fill Address Information and Payment Information then click Process button
