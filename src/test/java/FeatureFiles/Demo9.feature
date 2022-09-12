Feature: Add-Edit-Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the Setup, Parameters and Bank Account Button

  Scenario: Adding Bank Account
    And  Add Bank account button
    And  Fill the text areas
    Then Click the save button and verify


  Scenario: Editing Bank Account
    And Click the Edit Button
    And Refill the text areas
    Then Click the save button and verify


  Scenario: Deleting the Bank Account
    And  Click the Delete button and submit
