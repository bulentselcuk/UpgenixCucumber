@smoke_test
Feature: User should be able to click All Menu Items

  Scenario: All Menu Items must work

    Given User is on the login page
    When User should click to all menu items
    Then Verify all menu items and click logOut

