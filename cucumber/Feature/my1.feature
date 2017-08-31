Feature: Login Functionality Feature
Scenario Outline: 
    Given I open the application
    When I enter username as <username>
    And I enter password as <password>
    Then login successful

Examples:

| username | password | 

| ankitmalik95365      | 9536597182      | 

| ankitmalik95365     | 95365971    | 