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
@tag
Feature: Enter Vehicle Data
  Enter a Valid Data For Vehicle

  @EnterVehicleData
  Scenario: Enter Vehicle Data
    Given User navigates to tricentis vehicle insurance application
    And User fill the form with valid data
    When User clicks on the next button
    Then Insurant data form is displayed
    And User fill the Insurant form with valid data
    And User fill the Product form with valid data
    And User select Price
    And User send Quotes
    Then Insurance data was successfully sent
    
