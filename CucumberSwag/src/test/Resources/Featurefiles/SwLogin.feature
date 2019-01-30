@LoginProfie
Feature: Login to application

Background:
Given I eneter to the application entering the URL "https://www.saucedemo.com"
Then I should see the Loginpage of the application

@tag1
Scenario: Successful login
  When enter Username as "standard_user"
And enter Password as "secret_sauce"
And click on sign in button
Then I am on the Myprofile page on URL "www.mycompany.com/myprofile"
  And I should see "Welcome to your profile" message
   And I should see the "Log out" button
   
 