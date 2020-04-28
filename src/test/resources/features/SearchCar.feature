@Search-Cars
Feature: Acceptance Testing to validate Search car page
  To validate Search Car page
  Accepting Testing is performed

  @Search-Car-Positive
  Scenario: Validate the Search Car Page
    Given I am on Home Page "https://www.carsguide.com.au/" of Cars Guide Website
    When I go to menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Search Cars" link
    And I select carbrand as "BMW" from make dropdown
    And I select Carmodel as "1 Series" from model dropdown
    And I select location as "VIC - All" from location dropdown
    And I select CarPrice as "$1,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see the search cars
    And the title of the page should be "Bmw 1 Series Under 1000 for Sale Victoria | carsguide"
