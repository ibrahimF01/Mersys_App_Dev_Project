Feature: Adding School Locations, Editing School Locations and Delete School Locations

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the Setup, School Location and Locations Button

  Scenario: Create School Locations

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      |nameInput|academi35|
      |shortName|academi|
      |capacity|100|

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

  Scenario: Edit School Locations

    And Click on the element in the Dialog
      |editButton|

    And User sending the keys in Dialog content
      |nameInput|academi36|
      |shortName|academi|
      |capacity|100|

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    Scenario: Delete School Locations

      And Click on the element in the Dialog
      |deleteButton|
      |deleteDialogBtn|

      And Success message should be displayed


