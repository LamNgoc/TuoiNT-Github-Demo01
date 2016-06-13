#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template


Feature: Login System
	I want to test three cases:
	Login with invalid email
	Login with invalid password
	Login with invalid email and password


Scenario: Login with invalid email
Given Go to the login page successfully
When Input an email "tuoi@gmail.com"
	And Click Login button
Then Show an error message "Invalid email or password"

Scenario: Login with invalid password
Given Go to the login page successfully
	And Input an email "tuoint02@gmail.com"
When Input an password "12345678"
	And Click Login button
Then Show an error message "Invalid email or password"

Scenario: Login with invalid email and password
Given Go to the login page successfully
When Input an email "tuoi@mail.vn"
	And Input an password "123456789"
	And Click Login button
Then Show an error message "Invalid email or password"
