Feature: Search and assert page titles
  Scenario Outline: Search and assert title for <url> with keyword <keyword>
    Given the user navigates to the "<page_url>" page
    Then the user waits for 5 seconds
    And the user verifies that the page title contains "<keyword>"
    And the user closes the page
    Examples:
      | page_url    | keyword  |
      | googleUrl   | Google   |
      | amazonUrl   | Amazon   |
      | trendyolUrl | Trendyol |




