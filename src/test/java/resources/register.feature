@register
  Feature:
  As a end user
  I want to register providing all the required fields
  I should be able to register and log in
  Scenario: Register
    Given I am on the registration page
    When i enter all the required fields
      |email|tile |firsName|lastName|tel_number|password|confirm_password|
      |ram0@gmail.com|Mr|Rama|Krishna|07833548910|ramakrishan0|ramakrishan0|
      |ram1@gmail.com|Mr|Rama1|Krishna1|07833548911|ramakrishan1|ramakrishan1|
      |ram2@gmail.com|Mr|Rama2|Krishna2|07833548912|ramakrishan2|ramakrishan2|
      |ram3@gmail.com|Mr|Rama3|Krishna3|07833548913|ramakrishan3|ramakrishan3|
      |ram4@gmail.com|Mr|Rama4|Krishna4|07833548914|ramakrishan4|ramakrishan4|
    Then i should be able to register and login

