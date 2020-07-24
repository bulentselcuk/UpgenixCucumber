@View_all_order
Feature: User should be able to organize View All Orders Page

  Scenario: Organize the View All Orders Page
    Given User is on the login page and acces with credential.
    When User should click CheckAll button
    And User should click UncheckAll button
    And User should click FirstEdit button
    And User should fill Product Information and click Calculate.
    And User should fill Address Information and Payment Information then click Reset button.
    And User should click CheckAll button.
    Then User should click Delete button

