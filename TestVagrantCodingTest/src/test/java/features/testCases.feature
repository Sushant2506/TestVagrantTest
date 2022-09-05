Feature: Team RCB testing scenarios
  Scenario: 1_Validate team has only four foreign players
    Given I read the contents of input json file
    Then I validate there are only four foreign players

  Scenario: 2_Validate team has at least one wicket keeper
    Given I read the contents of input json file
    Then I validate that there is at least one wicket keeper
