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
@contact
Feature: Contact Us
  Test the contact us form and functionality

  @valid
  Scenario: Test successful submission of contact form
    Given I navigate to the contact us page
    When I enter name "john" email "john.doe@email.com" subject "Contacting test" and message "Hello world" and click submit
    Then I verify the success message "Success! Your details have been submitted successfully." is shown
