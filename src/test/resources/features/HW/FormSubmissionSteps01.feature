Feature: Fill out form on testpages.eviltester.com

  Scenario Outline: Fill form with details - "<firstname>", "<username>", "<age>", "<country>"
    Given I navigate to the form page
    When I fill in the form with "<firstname>", "<username>", "<age>", "<country>"
    And I submit the form
    Then I should see a success message

    Examples:
      | firstname | username       | age | country |
      | Amnah     | Amnah123sad123 | 25  | KSA     |
      | Omar      | Omar456sad123  | 30  | UK      |
      | Asma      | Asma789sad123  | 40  | Canada  |





