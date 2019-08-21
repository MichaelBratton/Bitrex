@login
Feature:Logging in

  Scenario: Login

    Given I login as user
    Then I should be on the activity stream