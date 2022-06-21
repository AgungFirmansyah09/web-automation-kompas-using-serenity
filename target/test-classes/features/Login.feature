@Login-Feature
Feature: Login - Kompas.com
  As a user
  I Want to perform login on Kompas.com
  and i can Directory to my home pages

  @Login-Successfully
  Scenario: User Login Successfully
    Given I Open Kompas Login Page
    When I Input valid email
    And I Input valid password
    And I Click button login
    Then I can see my home page

  @Login-Unsuccessfully
  Scenario: User Login Unsuccessfully
    Given I Open Kompas Login Page
    When I input wrong email
    And I input wrong password
    And I Click button login
    Then I can see error message