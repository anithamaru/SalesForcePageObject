Feature: Sales Force Test Cases
Scenario Outline: Navigate to Sales Force website
Given : Launch the URL 
Then : Validate the Page "<LoginPage>"
Then : Enter username "<UserName>" "Username"
Then : Enter password "<Password>" "Password"
And : Click the Button "Login"
Then : Validate the message "<Msg>"

Examples:
|UserName	|Password	|Msg	|LoginPage	|
|anitham2u@gmail.com	|	|Please enter your password.	|Login \| Salesforce	|

Scenario Outline: Login To SalesForce
Given : Launch the URL 
Then : Validate the Page "<LoginPage>"
Then : Enter username "<UserName>" "Username"
Then : Enter password "<Password>" "Password"
And : Click the Button "Login"
Then : Validate the Page "<Title>"

Examples:
|UserName	|Password	|Title	|LoginPage	|
|anitham2u@gmail.com	|Anitha@12	|Home Page ~ Salesforce - Developer Edition	|Login \| Salesforce	|


Scenario Outline: Check Remember me
Given : Launch the URL 
Then : Validate the Page "<LoginPage>"
Then : Enter username "<UserName>" "Username"
Then : Enter password "<Password>" "Password"
And : Select the Button "RememberMe"
And : Click the Button "Login"
Then : Validate the Page "<Title>"
And : Click the HPButton "User Menu"
And : Click the LogoutButton "Log Out"
Then : Validate the Page "<LoginPage>"
Then : Validate Username "<UserName>"

Examples:
|LoginPage |UserName	|Password	|Title	|LoginPage |
|Login \| Salesforce	|anitham2u@gmail.com	|Anitha@12	|Home Page ~ Salesforce - Developer Edition	|Login \| Salesforce	|


Scenario Outline: Forgot Password
Given : Launch the URL 
Then : Validate the Page "<LoginPage>"
And : Click forgot Password "ForgotPassword"
And : Provide username "<UserName>" "Username"
Then : Click continue button "Continue"
Then : Validate Display Message "<Msg>"

Examples:
|LoginPage |UserName	|Msg	|
|Login \| Salesforce	|anitham2u@gmail.com	|We’ve sent you an email with a link to finish resetting your password.	|

@SmokeTest
Scenario Outline: Login To SalesForce
Given : Launch the URL 
Then : Validate the Page "<LoginPage>"
Then : Enter username "<UserName>" "Username"
Then : Enter password "<Password>" "Password"
And : Click the Button "Login"
Then : Validate the message "<Msg>"

Examples:
|UserName	|Password	|Msg	|LoginPage	|
|123	|1231	|Please check your username and password. If you still can't log in, contact your Salesforce administra|Login \| Salesforce	|
