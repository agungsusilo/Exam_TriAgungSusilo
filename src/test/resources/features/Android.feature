@Android
Feature: Android test
#Feature: Create new To Do
  Scenario: add first to do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    Then User Click the save button
  Scenario: add second to do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 2"
    And User enter todo details with "details 2"
    Then User Click the save button

#Feature: Complete/check to-do
  Scenario: Check first to do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    Then User click the check button
    And User see the button is check

#Feature: Uncheck to-do
  Scenario: Uncheck first to do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    And User click the check button
    And User see the button is check
    Then User click the check button
    And User see the button is uncheck

#Feature: Filter To-Do for "Active" only
  Scenario: Filter Active to-do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    And User Click the Add button
    And User enter title "Todo 2"
    And User enter todo details with "details 2"
    And User Click the save button
    And User click the check button
    And User click the Filter button
    And User click the Active button
    Then User see the active to do list

#Feature: Filter To-Do for "Complete" only
  Scenario: Filter Complete to-do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    And User Click the Add button
    And User enter title "Todo 2"
    And User enter todo details with "details 2"
    And User Click the save button
    And User click the check button
    And User click the Filter button
    And User click the Completed button
    Then User see the completed to do list

#Feature: Refresh to do list
  Scenario: Refresh the list
    Given User is on to do list page
    When User click the threedot button
    Then User click the Refresh button

#Feature: Clear Completed To-Do
  Scenario: Clearing the to do that was completed
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    And User Click the Add button
    And User enter title "Todo 2"
    And User enter todo details with "details 2"
    And User Click the save button
    And User click the check button
    And User click the threedot button
    Then User click the ClearCompleted button

#Feature: Check Statictic
  Scenario: Checking statistic of the to-do
    Given User is on to do list page
    When User Click the Add button
    And User enter title "Todo 1"
    And User enter todo details with "details 1"
    And User Click the save button
    And User Click the Add button
    And User enter title "Todo 2"
    And User enter todo details with "details 2"
    And User Click the save button
    And User click the check button
    And User click the threebars button
    And User click the Statistics button
    Then User see the Statistic page

