Feature: Login

    @s_o_parametrized_login
    Scenario Outline: Parametrized login as <role>
    Given user is on the login page
    And user logs in with "<email>" and "<password>"
    Then user should be logged in as "<role>"

    Examples:
    | role              | email               | password |
    | Test Librarian 60 | librarian60@library | OoNKtPqP |
    | Test Student 65   | student65@library   | ZiA3SOPl |
    | Test Student 66   | student66@library   | Ys9e3SFW |
