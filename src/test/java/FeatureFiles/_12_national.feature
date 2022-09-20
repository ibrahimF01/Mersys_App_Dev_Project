Feature: Nationalities Functionality

  Background:Login start
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | Nationalities |

  Scenario:Addition operations and functions
    And Click on the element in the Dialog
      | addButton |
    And User sending the data in Dialog content
      | nameInput | Turk46 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario:Editing operations and functions
    And User sending the data in Dialog content
      | searchInput | Turk46 |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And User sending the data in Dialog content
      | nameInput | Arap69 |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario:Deletion operations and functions
    And Delete items from dialog
      | Arap69 |
    Then Success message should be displayed