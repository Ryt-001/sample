Feature: Home Page Login
	
  Background:
  Given verify reading excel data	
	
  @first
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
  @second
  Scenario: Successful verify with valid credentials
    And clicks the login button
    Then the user should be redirected to the home page
