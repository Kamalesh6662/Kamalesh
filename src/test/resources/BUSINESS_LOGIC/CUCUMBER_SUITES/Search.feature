Feature: Search Feature

Background: user is succesfully logged in 

When user opens the "Chrome" browser and exepath "G:\\Automation Tools\\chromedriver_win32\\chromedriver.exe"
When user opens the url "http://primusbank.qedgetech.com/"

@smoketests
Scenario: Login functionality for valid username and valid password
When user enters "Admin" as a username
When user enters "Admin" as a password
When user click on the "Login" button
When user able to click on "Branch" button
When user able to select Country as "INDIA"
When user able to select State as "MAHARASTRA"
When user able to select City as "MUMBAI"
When user able to click "Search" button
Then user able to see "Mumbai" city results
