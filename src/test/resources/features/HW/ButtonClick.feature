Feature: Click buttons on dynamic buttons page

  Scenario: Click buttons and verify message
    Given I navigate to the dynamic buttons page
    When I click all buttons
    Then I should see the message 'All Buttons Clicked!'
