Feature: Verify match statistics on ESPN Cricinfo

  Scenario: Viewing detailed statistics of a completed cricket match
    Given I am on the ESPN Cricinfo website
    When I select a completed cricket match
    And I navigate to the match statistics
    Then I should see detailed statistics including runs, wickets, and overs