Feature: Register and Login feature
  Scenario: Register and Login an account
    Given User is on the Home Page
    When User clicks on Login or Register button
    And User clicks on continue button
    And User fills the first name section
    And User fills the last name section
    And User fills the E-Mail section
    And User fills the telephone section
    And User fills the company section
    And User fills the AddressOne section
    And User fills the City section
    And User fills the Zip Code section
    And User fills the Country section
    And User fills the Region section
    And User fills the Login Name section
    And User fills the Password section
    And User fills the Password Confirm section
    And User selects the Subscribe radio button
    And User selects the read and agree to the Privacy Policy section
    And User clicks on the Continue button
    Then User will be redirected to a page that indicates the account is created with success
    Given User is on  the Login Page
    And User fills Login Name section
    And User fills Password section
    And User clicks on Login button
