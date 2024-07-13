Feature: verify logout functionality
@logout
Scenario Outline: logout function
Given user on login page
When user enters below credentials header"<username>" and "<password>"
And clicked login button
Then user should be navigated to the  homepage
And user should able to logout
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|