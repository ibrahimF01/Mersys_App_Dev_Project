Feature: Add-Edit-Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the Setup, Parameters and Bank Grade Level Button

  Scenario: Add Grade
    And Click Add Grade Level button
    And Fill the text area
    Then Click the save button and verify


  Scenario: Edit Grade
    And Click the Edit Button
    And Refill the text area
    Then Click the save button and verify


  Scenario: Delete Grade
    And Click the Delete button and submit