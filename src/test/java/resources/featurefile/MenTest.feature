@regression
Feature: Men Test

@smoke
  Scenario: User Should Add Product Successfully To Shopping Cart
    Given I am on homepage
    When I Mouse Hover on Men Menu
    And I Mouse Hover on Bottoms
    And I Click on Pants
    And I Mouse Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
    And Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    And Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    And Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
    And Click on ‘shopping cart’ Link into message
    And Verify the text ‘Shopping Cart.’
    And Verify the product name ‘Cronus Yoga Pant’
    And Verify the product size ‘32’
    Then Verify the product colour ‘Black’



