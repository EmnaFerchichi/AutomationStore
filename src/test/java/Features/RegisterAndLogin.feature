Feature: Register and Login feature
  Scenario: Register and Login into an account
    Given user is on the Home Page
    When user clicks on Login or Register button
    And user clicks on continue button
    And user fills the first name section
    And user fills the last name section
    And user fills the E-Mail section
    And user fills the telephone section
    And user fills the company section
    And user fills the AddressOne section
    And user fills the AddressTwo section
    And user fills the City section
    And user fills the Region section
    And user fills the Zip Code section
    And user fills the Country section
    And user fills the Login Name section
    And user fills the Password section
    And user fills the Password Confirm section
    And user selects the Subscribe radio button
    And user selects the read and agree to the Privacy Policy section
    And user clicks on the Continue button
    Then user will be redirected to a page that indicates the account is created with success
    Given user is on the Login Page
    And user fills Login Name section
    And user fills Password section
    And user clicks on Login button
