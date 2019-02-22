@search
Feature:
  As a end user
  i want to search for a product
  so that i can see all relevant products

  Background: i am on the home page

  Scenario Outline: valid search

    Given i am on the home page
    When i search for  a product "<product>"
    Then i should see all the relevant products

  Examples:
  | product |
  | shirt |

