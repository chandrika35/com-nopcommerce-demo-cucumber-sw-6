Feature: Homepage Test
  As a user I can navigate to various pages successfully

 @Sanity @Regression
  Scenario: User can navigate to Computer page successfully
    Given I am on homepage
    When I select computers
    Then Computers text displayed

  @Smoke @Regression
  Scenario: User can navigate to Electronics page successfully
    Given I am on homepage
    When I select electronics
    Then Electronics text displayed

  @Regression
  Scenario: User can navigate to Apparel page successfully
    Given I am on homepage
    When I select apparel
    Then Apparel text displayed