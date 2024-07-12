Feature: Get Rates Page Functionality

  Background:
    Given user opens Shamba application website

    Scenario: User is on GetRates screen page
      When user clicks on GetRates button
      Then user Click on Plan Option and select Cover
      When user Click on Main life DoB text field and select dates
      Then user Click on view button to proceed with quotes
      When User Click on Start Sale Button
      Then user Click continue or cancel button on FAIS Disclosure PopUp Link