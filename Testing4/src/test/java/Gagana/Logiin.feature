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
@SmokeTest
Feature: Register patient

  Scenario: login to application and registering patient
    Given User is in login page
    When User enters "username" and "password"
    And User click on login
    Then user Navigated to home page
    And user enters paients name
    Then user selects patients gender
    Then user enters patient Age
    And user enters patients address
    When user registers the patient
    Then user clicks on logout
