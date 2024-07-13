@login
Feature: valid login feature for saucedemo labs
  @login_valid
  Scenario Outline: login function data driven
    Given user on login page
    When user enters below credentials header"<username>" and "<password>"
    And clicked login button
    Then user should be navigated to the  homepage
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|

  @login_invalid
  Scenario Outline: login function data
    Given user on login page
    When user enters below credentials header"<username>" and "<password>"
    And clicked login button
    Then user should be locked in the homepage
    Examples:
      |username|password|
      |locked_out_user|secret_sauce|

