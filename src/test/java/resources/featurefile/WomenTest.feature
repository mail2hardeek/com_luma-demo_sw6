@regression
Feature: Women Test
  Background: Given I am on homepage
  @smoke
  Scenario: Verify The SortBy Product Name Filter

    When I Mouse Hover on Women Menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    And I Select Sort By filter “Product Name”
    Then User should be able to Verify the products name display in alphabetical order
  @smoke
Scenario: Verify The SortBy Price Filter
  When I Mouse Hover on Women Menu
  And I Mouse Hover on Tops
  And I Click on Jackets
  And I Select Sort By filter “Price”
  Then User should be able to Verify the products price display in Low to High