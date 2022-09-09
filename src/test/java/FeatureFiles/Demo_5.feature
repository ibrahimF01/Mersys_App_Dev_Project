Feature: Add-Edit-Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click to Human Resources and click to Setup and positions

  Scenario: add button scenario:
    And Click to add button
    And Write to name and short name
    Then Click to save button and verify

  Scenario: edit button scenario:
    And Click to Positions and Click to edit button
    And Rewrite to name and short name
    Then Click to save button and verify

  Scenario: delete button scenario:
    And Click to Positions and Click to delete button
    Then Click to delete button and verify