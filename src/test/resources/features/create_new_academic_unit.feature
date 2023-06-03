Feature: Create new academic unit
  As admin I want to create a new unit academic
  To have an administrative structure at the university

  Scenario: From the home page I can go to the academic unit form and create a new academic unit successfully
    Given I am in the home page of PLA 1
    When I go to academic unit form and fill it
    Then I can save a new academic unit
