Feature: User Registration

  Scenario: Verify Thata User Can register using valid data
    Given User is on homepage
    When User clicks on signup login button and enters valid signup data
    And fill signup form and click on creat account button
    Then user is redirected to account creation page
