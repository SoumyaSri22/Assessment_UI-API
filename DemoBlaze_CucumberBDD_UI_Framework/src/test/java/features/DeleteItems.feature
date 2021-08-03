Feature: Delete items from cart

 Scenario: User Deletes items from cart
   Given User has some items in cart present
   When User navigates to cart page
   Then User clicks on Delete button for an item
   Then Validate user is on cart page
