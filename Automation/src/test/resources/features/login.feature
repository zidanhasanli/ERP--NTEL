@Zidan
Feature: Login feature

  Background:
    Given user is on the login page

  Scenario Outline: Positive login scenario
    When User enters correct "<username>" and "<password>"
    And  User click to the login button
    Then User is successfully logged in and url change to "https://qa.erp-intel.site/employees"

    Examples:

      |   username        | password |
      | user1@gmail.com   |  user1   |
      | user2@gmail.com   |  user2   |
      | user3@gmail.com   |  user3   |

  Scenario Outline: Negative login scenario
    When User enters incorrect "<invalidUsername>" and "<invalidPassword>"
    And  User click to the login button
    Then User is not able to logged in and url is "https://qa.erp-intel.site/"

    Examples:

      |    invalidUsername      |    invalidPassword   |
      |   mibshgy25@@info.com   |    uhdgvdggvcdg      |
      |   kjgg5@gmail..com      |    ddvbgnhnmhmg      |
      |   erch69mail.com        |    r55msjcbshdb      |



