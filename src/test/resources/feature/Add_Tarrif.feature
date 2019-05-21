#Author: your.email@your.domain.com
#Keywords Summary :

Feature: to test add tarrif plan functionality
  
  Scenario: To test Add Tarrif plan with valid data
    Given the User is in add customer page
    Given the user is on add tarrif plan page
    When the user fill the valid tarrif plan detail 
    Then the confirmation message should display  
    
  