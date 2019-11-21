Feature:search engine
Scenario:searching:products in testme app using login credentials
Given user logins and search for perticular product
When login to testme app
And enters username as "lalitha"
And password as "password123"
And clicks on search and search for "headphone"
Then purchase the product

