Feature: search book


  @search_book
  Scenario: As a librarian I should be able to search books by author
    When user click on Books in the top-menu bar
    And user navigates to search box to enter desirable author name
    Then user is able to see searched result Book got filtered out


