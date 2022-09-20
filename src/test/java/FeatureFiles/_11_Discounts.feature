Feature: Discounts Functionality

  Background:Login start
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | Discounts  |

  Scenario: Addition operations and functions
    And Click on the element in the Dialog
      | addButton |
    And User sending the data in Dialog content
      | Description1 | Thor |
      | integration1 | ey4e4y   |
      | Priority1 | 007  |
    And Click on the element in the Dialog
      | saveButton  |
    Then Success message should be displayed

  Scenario:Editing operations and functions
    And User sending the data in Dialog content
      | searchInput | Thor |
    And Click on the element in the Dialog
      | searchButton |
      | editButton   |
    And User sending the data in Dialog content
      | Description1 | Lokiy |
      | integration1 | 6d51gdf   |
      | Priority1 | 055  |
    And Click on the element in the Dialog
      | saveButton  |
    Then Success message should be displayed

  Scenario:Deletion operations and functions
    And Delete items from dialog
      | Lokiy |
    Then Success message should be displayed