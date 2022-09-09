Feature: Add-Edit-Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click to Education and click to Setup and Subject Categories

  Scenario: add button scenario:
    And Click to add button
    And Write to name and code
    Then Click to save button and verify

  Scenario: edit button scenario:
    And Click to edit button
    And Rewrite to name and code
    Then Click to save button and verify

  Scenario: delete button scenario:
    And Click to delete button
    Then Click to delete button and verify