@Used-Search-Cars
Feature: Acceptance Testing to validate used car Search page
  To validate Used Car Search Page
  Accepting Testing is performed

  @Used-Search-Car-Positive
  Scenario: Validate the Used Car Search Page
    Given I am on Home Page "https://www.carsguide.com.au/" of Cars Guide Website
    When I go to menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Used" link on Used Car Search Page
    And I select carbrand as "Audi" from make dropdown on Used Car Search Page
    And I select Carmodel on Used Car Search Page
      | carModel |
      | A3       |
      | A4       |
      | A5       |
    And I select location as "ACT - All" from location dropdown on Used Car Search Page
    And I select CarPrice as "$1,000" from price dropdown on Used Car Search Page
    And click on Find_My_Next_Car button on Used Car Search Page
    Then I should see the search cars on Used Car Search Page
    And the title of the page should be "Used Audi A3 Under 1000 for Sale ACT | carsguide"
