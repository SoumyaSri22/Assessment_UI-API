Feature: Get feature for pet

  Scenario: Get details for existing pet by status
    Given User send a valid GET request with given status 
    Then Verify User should get a success response

   
