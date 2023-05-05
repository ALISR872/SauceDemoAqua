Feature: Login page with Aqua
@wip
  Scenario: Positive login test
    Given the user is on the login page
    When the user enters with "standard_user" and "secret_sauce" and clicks login button
    Then the user should be able to login successfully