Feature: Document Types Functionality

  Background:Login start
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypes |

  Scenario:Addition operations and functions
    And Click on the element in the Dialog
      | addButton |
      | required  |
      | active    |
      | useCamera |
      | required  |
      | active    |
      | useCamera |
    And User sending the data in Dialog content
      | nameInput   | Ragnar               |
      | description | King Ragnar Lothbrok |
    And Click on the element in the Dialog
      | stageCheck          |
      | studentRegistration |
      | examination         |
      | employment          |
      | certificate         |
      | contract            |
      | dismissal           |
      | studentRegistration |
      | examination         |
      | employment          |
      | certificate         |
      | contract            |
      | dismissal           |
      | employment          |
    And Click on the space with robot
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario:Editing operations and functions
    And User sending the data in Dialog content
      | searchInput | Ragnar |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And Click on the element in the Dialog
      | required    |
      | active      |
      | useCamera   |
      | active      |
      | useCamera   |
      | description |
    And User sending the data in Dialog content
      | nameInput   | Ivar              |
      | description | Ivar the Boneless |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed

  Scenario:Deletion operations and functions
    And Delete items from dialog
      | Ivar |
    Then Success message should be displayed