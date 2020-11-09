
Feature: search user

  Background: login to libraryCT
    When user is on login page
    And  user logs in as librarian


  @search_user
    Scenario: As a librarian I should be able to search users by Full Name
      When user click on Users in the top-menu bar
      And user select ACTIVE in Status dropdown
      And user navigates to search box to enter desirable name
      Then user is able to see searched result got filtered out