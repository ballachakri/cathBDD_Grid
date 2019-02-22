@login
Feature:
  As a end user
  i want to log in with my details
  So that i can do see all my details
  Background: i am on the home page
    Scenario Outline: login with valid details
      Given i am on the login page
      When I enter my email id "<email>"
      And I enter my password "<password>"
      Then I should be able navigate to registered user page
      Examples:
      | email | password |
      | ballachakri@yahoo.com| Khalifa123 |