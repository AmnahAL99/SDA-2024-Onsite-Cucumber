Feature: name of  the feature file
  Background:
    Given user goes to google page
  @Samsung
  Scenario: TC01_samsungSearch
    When user searches for "samsung"
    Then tests the page title contains the word "samsung"
    And closes the page
  @Cucumber
  Scenario: TC02_samsungSearch
    When user searches for "cucumber"
    Then tests the page title contains the word "cucumber"
    And closes the page



