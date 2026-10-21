Feature: Login

    Background: 
        Given user is on the login page

    Scenario: Successful login with valid credentials
        When user enters valid username and password
        And clicks on the login button
        Then user should be redirected to the home page
        And user should see 'Logged in as [username]' message

    Scenario: Unsuccessful login with invalid credentials
        When user enters invalid username and password
        And clicks on the login button
        Then user should see an error message

    Scenario: User logs out successfully
        Given user is logged in
        When user clicks on the logout button
        Then user should be redirected to the login page

    