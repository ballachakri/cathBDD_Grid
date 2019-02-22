@sort
Feature:
  As a end user
  I want to sort the products by price range
  So that i can view products in selected price range
  Background: i am on home page
    Scenario Outline: sort by price
      Given I am on the home page
      When  I search for the product "<product>"
      Then I should view all the relevant products
      When I select the price range "<Price Range>"
      Then I should see all the products within the selected price range

      Examples:
      |product | Price Range |
      | T-shirt  | 5     50  |
      | jeans | 5    100 |
