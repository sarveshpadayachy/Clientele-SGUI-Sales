Feature: Landing Page Functionality

  Background:
    Given Open landingPage url

    Scenario: User is on landing page screen
      When Login in using valid Credentials
      When Clicks on ClienteleLogo
      Then Clicks on CaptureSale