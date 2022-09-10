Feature: Fields Functionality

  Background:Login start
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

  Scenario: Addition operations and functions
    And Click on the element in the Dialog
      | addButton |
    And User sending the data in Dialog content
      | nameInput | Ragnarok |
      | codeInput | ey4e4y   |
    And Click on the element in the Dialog
      | fieldType   |
      | listOfValue |
    And User sending the data in Dialog content
      | keyInput   | Ivar    |
      | valueInput | 95dgsd5 |
    And Click on the element in the Dialog
      | exAddButton |
      | saveButton  |
    Then Success message should be displayed

  Scenario:Editing operations and functions
    And User sending the data in Dialog content
      | searchInput | Ragnar |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And User sending the data in Dialog content
      | nameInput | Ivar    |
      | codeInput | 9ds5g4s |
    And User sending the data in Dialog content
      | keyInput   | Ragnar   |
      | valueInput | gsg5s5fg |
    And Click on the element in the Dialog
      | exAddButton |
      | saveButton  |
    Then Success message should be displayed

  Scenario:Deletion operations and functions
    And Delete items from dialog
      | Ivar |
    Then Success message should be displayed