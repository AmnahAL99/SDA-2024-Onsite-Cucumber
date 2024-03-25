Feature: name of  the feature file
Background: The name of background
  Given I open the browser
  And I am on the google homepage

  Scenario: The name of scenario
    When I search for amazon on google
    Then I should see amazon on the results
    Then I close the browser
  @mytag
  Scenario: The name of second scenario

    When I search for "linkedin" on google
    Then I should see "linkedin" on the results
    Then I close the browser



