Feature: Capture Sale Functionality

  Background:
    Given user opens the Website

    Scenario: User is on capture sale page screen
      When user login using valid credentials
      And user clicks on clientele icon
      And user clicks on capture sale icon
      Then user clicks on lead basket