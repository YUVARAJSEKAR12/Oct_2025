@Runall
Feature: Validate the Login Page

  Background: 
    Given Launch the URL
	
  Scenario: 
    When Enter the username "testone username"
    And Enter the password "testtwo - password"
    And Click the login button
    Then Validate the Homepage

  @test1
  Scenario: Validate username and password
    When Enter the username "testone username"
    And Enter the password "testtwo - password"
    And Click the login button
    Then Validate the Homepage

  @test2
  Scenario: Validate ivallid username and password
    When Enter the username "testone usewifiewgfername"
    And Enter the password "testtwo - pahdsfhsdjgfjssword"
    And Click the login button
    Then Validate the Homepage

  @mobile_data
  Scenario Outline: Validate the mobile data
    When Enter the mobile data "<Mobile>"

    Examples: 
      | Mobile  |
      | OnePlus |
      | Iphone  |
      | MI      |
