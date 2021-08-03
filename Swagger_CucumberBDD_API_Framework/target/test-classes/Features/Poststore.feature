Feature: Purchase order for Pet

  Scenario: User is able to purchase order for pet
    Given User sends a POST Request to make a purchase
    Then user should get a valid response code
    