@shopping_cart
  @regression
Feature: Shopping Cart Automation

  Scenario: Purchase "Build your own cheap computer"
    Given User is on Demo Web Shop homepage
    When User logs in with valid credentials
    And User navigates to Computers -> Desktops
    And User selects "Build your own cheap computer"
    And User adds the computer to cart
    And User accepts Terms and Conditions
    And User proceeds to checkout
    And User completes Billing and Shipping details
    And User selects Cash on Delivery as payment method
    And User confirms the order
    Then User captures the order number
