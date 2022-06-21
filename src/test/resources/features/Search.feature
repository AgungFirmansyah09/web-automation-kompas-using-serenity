Feature: Search Berita in kompas
  As user
  I Want to Search news in home page kompas.com
  and I want to see the news in the second line

  @Search-News
  Scenario: Search News Successfully
    Given I has login in kompas
    When I in home page kompas
    And I input news
    And I clik button Search
    And I click news in the second line
    Then I can see the news