@smoke_test
Feature: User should be able to click All Menu Items

  Scenario Outline: All Menu Items must work

    Given User is on the login page
    When User click to "<Menu>" item
    Then Verify "<Subtitle>"

    Examples:
      | Menu              | Subtitle           |
      | View all orders   | List of All Orders |
      | View all products | List of Products   |
      | Order             | Order              |