
Feature: Invalid Credentials login

  Scenario: Unsuccessful login with invalid Credentials
    Given User opens browser to login
    When User is on Log in screen
    Then User enter invalid credentials
    Then Appropriate error message is seen
   

  
