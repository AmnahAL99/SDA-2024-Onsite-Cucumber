
Feature: Click buttons and verify message

  Scenario: Click buttons and verify message
    Given open the website
    Then Click on "start" button and wait
    And Click on "One" button and wait
    Then Click on "Two" button and wait
    And Click on "Three" button and wait
    Then Verify "All Buttons Clicked" message Displayed

