@VAP
Feature: User should be able to see View All Product Page

  Scenario: Watch the View All Product Page
    Given User is on the login page and access with credential.
    When User should verify the subtitle is "List of Products"
    Then User should verify the table has three rows
