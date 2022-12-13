Feature: Reto phptravels

  @regression
  Scenario: Full phptravels
    Given that a user wants to enter the phptravels page
    When fill in all the requested fields in the form
    Then successful entry
