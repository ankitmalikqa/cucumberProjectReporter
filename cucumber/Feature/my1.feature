Feature: Login Functionality Feature

Scenario: Check Scen1
    Given I open the application
    When I enter username as "ankitmalik"
    And I enter password as "malikankit"
    Then login successful
    
Scenario: Check Scen2
    Given I open the application
    When I enter username as "ankitmalik"
    And I enter password as "malikankit1"
    Then login successful    

