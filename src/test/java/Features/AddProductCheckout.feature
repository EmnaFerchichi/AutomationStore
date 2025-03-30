Feature: Add And Checkout Products feature
  Background: Test Adding products into cart

    Given  user clicks on the Login Page
    And User fills LoginName
    And User fills Password
    And User  clicks on login button
    And User  clicks  on Home page
    And User selects Skinsheen Bronzer Stick Product
    And User selects  Benefit Bella Bamba Product


  Scenario: Test Products Checkout
    Given User clicks on Ckeckout Button
    Then User is be redirected to Checkout Page
    And User clicks on confirm checkout Button

