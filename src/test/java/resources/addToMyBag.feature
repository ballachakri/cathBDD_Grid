@addtobag
  Feature:

    As a end user
    i search for a product
    and i want to select a product randomly
    the product should be adde to basket

    Background: i am on the home page

    Scenario Outline: select product randomly

      Given I am on the home page
      When I search for the product "<product>"
      Then I should view all the relevant products
      And i will select a product randomly
      Then the product should be added to shopping bag
      Examples:
      |product|
      |shirt|