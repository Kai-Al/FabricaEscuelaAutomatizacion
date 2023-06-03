Feature: Create new academic subunit
  As admin I want to create a new academic subunit linked to an academic unit previously created
  To have an administrative structure at the university

  Scenario: From the home page I can go to the academic units list, choose one and link a new academic subunit
    Given I am in the home page of PLA 2
    When I link a new academic subunit to an academic unit
    Then I can save the new academic subunit
