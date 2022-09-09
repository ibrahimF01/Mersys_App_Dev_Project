Feature: Human Resource Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Admin User Able to Add Attestations Categories Human Resources
  And Click on the Human Resouces in the left Nav
    Then User Add Human Attestations Position
    Then User Edit Human Attestations Position
    Then User Delete Human Attestations Position


