Feature: Delete an academic unit
  As admin I want to delete an academic unit
  To quit those academic units that ceased to exist

  Scenario: From the home page I can go to the academic unit and if the academic unit has subunits I cannot delete the academic unit
    Given I am in the home page of PLA 4
    When I go to academic unit with subunits and I try to delete the academic unit
    Then I cannot delete the academy unit

  Scenario: From the home page I can go to the academic unit and if the academic unit does not have subunits I can delete the academic unit
    Given I am in the home page of PLA 5
    When I go to academic unit without subunits and I try to delete the academic unit
    Then I can delete the academy unit
