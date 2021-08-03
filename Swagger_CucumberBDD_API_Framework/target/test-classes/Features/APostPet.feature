Feature: Add a new pet to store
  
  Scenario: User is able to add new pet to store
    Given User send a valid POST request to add a pet
    Then user should get a success response code
   
      
