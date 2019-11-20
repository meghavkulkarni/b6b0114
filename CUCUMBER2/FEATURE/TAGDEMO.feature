
Feature: checking login functionality
@Functionaltest
  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters lalitha as username
    And user enters password123 as password
    Then user will   Finds a testmeapp homepage

  @Sanitytest
  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters admin as username
    And  user enters password456 as password
    Then user will   Finds a testmeapp admin page