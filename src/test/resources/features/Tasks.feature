@tasks
Feature: Tasks
@task1
  Scenario: Create a task with a deadline
    Given I login as user
    Then I navigate to tasks
    Then I set "TestTask123" as the title
    And I change deadline to "2020" "May" "5" "05:20"
    Then I submit the task
