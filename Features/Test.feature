
@tag
Feature: Login Action
Test Login Functionality
  @tag1
  Scenario Outline: Successfully login with valid credentials
    Given navigate to home page
    When user enters "<username>" and "<password>"
		Then Message login Successfully
		
		Examples:
      | username  						| password 		|
      | lalitha@lalitha.com 	| Password123 | 
      | rick@rick.com					| Rick123    	|    
			|	andrew@andrew.com			| Andrew123		|
	
	