Feature: Revise the Page Object Model and Page Factory

Scenario Outline: Open the chrome and perform actions using POM and PF

Background: User opens the login page
When user open the safari
And enter the credentials
And click on the login button
Then verify the user if logged in correctly

When user is logged in 
And takes screenshot
Then print the success statement
And close the browser