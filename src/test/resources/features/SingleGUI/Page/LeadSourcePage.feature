Feature: Lead Source Functionality

  Background:
    Given user opens the URL

  Scenario: User is on lead source page screen
    When User login using valid credentials
    Then User clicks on clientele logo
    When User clicks on capture sale
    Then User clicks on lead basket
    When user select lead on checkbox
    Then user clicks on action sale button
