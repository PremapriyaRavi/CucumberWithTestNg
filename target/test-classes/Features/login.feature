Feature: To validate the login functionality of CrazySales Application

Scenario: To validate the login functionality with invalid credentials
		Given The user has to be in the CrazySales login page
		When The user fill the username and password
		And click login
		Then The user should navigate to the invalid login page
		
Scenario Outline: To validate the registration functionality 
    Given The user has to be in the CrazySales login page
		When The user fill the "<email>" and "<password>" and "<confirmpw>"
		And  click on create new button
		Then The user  was registered sucessfully
   Examples:
     |	email	|	password	|	cndfirmpw	|
     | Pinky@1| 12345     | `12345    |
     |	Priya | 12345     |  12345    |
    
    #cucumber-testng
    #note...here the given is same so it won't generate the snippets for second given
    # but the given is executes for both scenario 
    
    # in cucumber-junit we are using the background to execute before every scenario