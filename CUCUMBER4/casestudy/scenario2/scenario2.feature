Feature:user login to testme app 

Scenario Outline:user enters username and password in testme app
Given login to testmeapp
When user clicks on login
And username as dha karanam
And password as megha123k
Then clicks on login
Examples:

|username|AlexUser|
|password|Alex@123|
