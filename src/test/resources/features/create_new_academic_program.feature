Feature: Create new academic program
  As admin I want to create a new academic program linked to an academic subunit previously created
  To have an administrative structure at the university

  Scenario: From the home page I can go to the academic units list, choose one, select an academic subunit and link a new academic program
    Given I am in the home page of PLA 3
    When I link a new academic program to an academic subunit
    Then I can save the new academic program
