Feature: Fill and submit form on input-validation page

  Scenario: Fill form and submit with dynamic data
    Given I navigate to the form page1
    When I1 fill in the form with "Amnah", "AmnahSDA12309", "25", "USA"
    And I submit the form1
    Then I should see a success message1

  Scenario: Fill form and submit with different dynamic data
    Given I navigate to the form page1
    When I1 fill in the form with "Asma", "As123", "30", "UK"
    And I submit the form1
    Then I should see an error message1
