Feature: login Action
Scenario Outline:Successful login with valid credentials
Given user will open the application
When user clicks on login
And user enters "<username>" and "<password>"
Then message displayed login successfully


Examples:
|username    |password|
|megha98@gmail.com|megha123k|
|aravind.guggilla57@gmail.com|aravind|
|aravindakumarguggilla@gmail.com|Aravind@123|