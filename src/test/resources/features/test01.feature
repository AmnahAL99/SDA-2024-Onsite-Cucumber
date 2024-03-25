Feature: Google Search
  Background:
    Given I am on the Google search page

  Scenario Outline: Search for "<term>"
    When I enter "<term>" in the search bar
    And I submit the search
    Then I should see results for "<term>"

    Examples:
      | term    |
      | mac     |
      | windows |
      | linux   |




