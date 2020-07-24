@Login
Feature: User should be able to login

  Scenario: Login as a user
    Given user is on the login page
    When user logs in with "Tester" username and "test" password
    Then user should verify that page logo "Web Orders" is displayed
