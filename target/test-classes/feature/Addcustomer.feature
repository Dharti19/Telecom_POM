#Author: your.email@your.domain.com
#Keywords Summary :

Feature: To Test add customer Functionality

  Scenario: To Test Customer Id generate for Valid Customer
    Given the user is in home page 
    When the user fill in the valid customer details
    When the user click the submit button
    Then The user should see the customer id
