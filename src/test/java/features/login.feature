Feature: Test the login functionality


  Scenario: Verify the Login Section
    Given User open the website and go to login page
    When user enter "mngr370031" & "Ahytatu" and click login button
    Then user should login successfully

  Scenario Outline: Verify login with invalid credentials
    Given User open the website and go to login page
    When user enter "<userId>" & "<password>" and click login button
    Then user should get an error message

    Examples:
      | userId     | password |
      | mngr370031 | wrong    |
      | omar       | Ahytatu  |
      | saber      | wrong    |