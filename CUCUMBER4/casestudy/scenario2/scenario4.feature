Feature:user moves to payment method without adding product to cart
Scenario:alexa has registered to testme app
Given user registered to testme app
When user search perticular product like headphone
And try to proceed topayment without adding to cart
Then testme app doesnot display cart icon