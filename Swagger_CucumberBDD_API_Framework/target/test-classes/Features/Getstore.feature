Feature: Find purchase order by ID

  Scenario: Get purchase order by ID
    Given User sends a GET request to get purchase order by ID
    Then User should get a valid response code
    
