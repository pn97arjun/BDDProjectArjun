Feature: Mercury hTours

  @Test1
  Scenario: Launch application Flights
    Given I launch URL
    And I register new User
    Then I log off from application


  @Test2
   Scenario Outline:  Login with new user
    Given I launch URL
    And I login with "<username>" "<password>"
    And I Sign off
    Examples:
    | username | password |
    | arju11   | 12345    |



