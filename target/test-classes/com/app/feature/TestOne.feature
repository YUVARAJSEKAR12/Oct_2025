Feature: Exaplining the Datatable Concept

  @list
  Scenario: Validate Data table Concept
    Given Launch the URL
    When Enter the deatils for practise form
      | Yuvaraj       |
      | Sekar         |
      | test@test.com |

  #And Enter the password "testtwo - password"
  # And Click the login button
  # Then Validate the Homepage
  @Map
  Scenario: Validate Data table Concept
    Given Launch the URL
    When Enter the deatils for emp form
      | FirstName | Yuvaraj       |
      | Lastname  | Sekar         |
      | Email     | test@test.com |
