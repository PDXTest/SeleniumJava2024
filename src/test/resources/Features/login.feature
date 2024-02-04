Feature: Test Login Fucntionality

  Scenario: Check login is successful
    Given User is on login page
    When User enters username and password
    And Clciks on login button
    Then User navigate to home page

  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And Clciks on login button
    Then User navigate to home page

    Examples: 
      | username | password  |
      | user1    | password1 |
