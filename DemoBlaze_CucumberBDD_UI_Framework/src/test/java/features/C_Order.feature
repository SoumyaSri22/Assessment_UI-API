
Feature: Order Confirmation

  Scenario: User is able to place an order
    Given User opens Demo Blaze app
    When User adds one item from monitor category
    Then User navigates to Cart page and place order
    Then User enters all details in the pop up and purchase
    Then User gets an order confirmation popup
