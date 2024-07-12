Feature: home Page Functionality

  Background:
    Given  user opens the URL

    Scenario Outline: User is on login page screen
      When user clicks on Arrow Navigation  button
      And user enters "<Username>"
      Then User enters "<password>"
      And user clicks on Log-in button



      Examples:
      | Username | password     |
      | WRambau  | clientele |
