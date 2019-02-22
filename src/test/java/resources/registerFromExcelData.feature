@loginExcelData
  Feature:
    As end user
    i want to enter multiple data from excel
    so that all individual user are registered
    Background: i am on the home page
      Scenario: user data from excel sheet
      Given i am on the home page for excel data
      When i enter all the data from excel sheet
      Then all the individual shoild be registered
