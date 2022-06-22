Feature: Your Logo Order workflow

Scenario: Verify user is able to add an item to the cart and navigate until payment
Given user is on your logo website home page
When user mousehover on Dresses menu and then select summer dresses
And user changed the products view of the products to list view 
And user adds the product to the cart 
And user proceed to checkout 
And user increased the quantity to two dresses
And user login into the user account 
And user confirms the address and shipping address
Then the name of the product and price is printed in the console
