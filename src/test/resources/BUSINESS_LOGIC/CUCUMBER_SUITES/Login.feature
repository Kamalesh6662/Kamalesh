Feature: Login Feature

Background: user is succesfully logged in 

When user opens the "Chrome" browser and exepath "G:\\Automation Tools\\chromedriver_win32\\chromedriver.exe"
When user opens the url "http://primusbank.qedgetech.com/"

@smoketests
Scenario: Login functionality for valid username and valid password
When user enters "Admin" as a username
When user enters "Admin" as a password
When user click on the "Login" button
Then the user is on the "ADMIN" page and get message as Welcome to Admin