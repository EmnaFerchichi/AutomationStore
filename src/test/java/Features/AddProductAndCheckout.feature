Feature: Add and Checkout Product feature
  Background: Test Adding a product into cart

    Given  User clicks on the Login Page
    And user fills LoginName
    And user fills Password
    And user  clicks on login button
    And user  is on Home page
    And user selects Skinsheen Bronzer Stick Product
    And user selects  Benefit Bella Bamba Product
    And user clicks on Ckeckout Button
    Then User will be redirected to Checkout Page


   Scenario: Test Product Checkout
     Given user clicks on Confirm Order Button
     Then user will be redirected to a page with a checkout confirmation notification
