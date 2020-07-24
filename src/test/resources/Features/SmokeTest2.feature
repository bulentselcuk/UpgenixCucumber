@senario_outline
Feature: User should be able to click All Menu Items

  Scenario Outline: All Menu Items must work

    Given User is on the login page
    When User click to "<Menu>" item

    Examples:
      | Menu              |
      | View all orders   |
      | View all products |
      | Order             |