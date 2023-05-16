Feature: ComputerPage Test
  As a user I want to arrange products and add them to shopping cart successfully

  @Sanity @Regression
  Scenario: User can arrange the products in alphabetical order
    Given I am on homepage
    When I click on computer
    And I click on desktop
    And I select sort by position Name: Z to A
    Then Verify the Product will arrange in Descending order

  @Smoke @Regression
  Scenario: User can add the products to shopping cart successfully
    Given I am on homepage
    When I click on computer
    And I click on desktop
    And I select sort by position Name: A to Z
    And CLick on Add to cart
    And Verify the Text Build your own computer
    And I can Select processor "2.2 GHz Intel Pentium Dual-Core E2200"
    And I can Select ram "8GB [+$60.00]"
    And I can Select HDD radio "400 GB [+$100.00]"
    And I can Select OS radio "Vista Premium [+$60.00]"
    And I can Select check box "Total Commander"
    And Verify the price "$1,475.00"
    And I can Click on add to cart button
    And Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And I can close the bar clicking on close button
    And I can MouseHover on Shopping cart and Click on GO TO CART button
    And I can Verify the message "Shopping cart"
    And I can change the Qty to "2" and Click on Update shopping cart
    And Verify the Total "$2,950.00"
    And I can click on checkbox I agree with the terms of service
    And I can click on checkout
    And Verify the Text "Welcome, Please Sign In!"
    And I can click on checkout as a guest tab
    And I can fill all mandatory field
    And I can click on next day air radio button
    And Click on continue
    And Select credit card radio button
    And Click on the continue
    And I can select master card
    And I can fill all mandatory field for payment
    And Verify payment method is "Credit Card"
    And Verify shipping method is "Next Day Air"
    And I can click on confirm button
    And I can Verify text "Thank you"
    And Verify the message "Your order has been successfully processed!"
    And Click on the continue button
    Then Verify text "Welcome to our store"