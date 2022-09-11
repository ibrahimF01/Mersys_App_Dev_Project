Feature: School Departments add, edit and delete functionalities

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the Setup, School Location and Departments Button


    Scenario: Create a school department

      And Click on the element in the Dialog
        | addButton |

      And User sending the keys in Dialog content
        |nameInput|mathx3|
        |code|mathx2|

      And Click on the element in the Dialog
        |section|
        |SchoolDepartment|

      And Click on the element in the Dialog
        | saveButton |

      And Success message should be displayed

      Scenario: Edit the school department

        And Click on the element in the Dialog
        |editButton|

        And User sending the keys in Dialog content
          |nameInput|mathx4|
          |code|mathx2|

        And Click on the element in the Dialog
          |section|
          |SchoolDepartment|

        And Click on the element in the Dialog
          | saveButton |

        And Success message should be displayed

        Scenario: Delete the school department

          And Click on the element in the Dialog
            |deleteButton|
            |deleteDialogBtn|

          And Success message should be displayed





