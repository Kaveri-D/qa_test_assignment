Feature: Verify user can add item to basket
 As a user
 I want to serch highest price item
 so I can add the item to basket
@smoke
Scenario: Verify user can add highest price item to basket
  Given I am on homepage
  When  I login using correct credentials
  Then  I should login successfylly
  And   I search for highest price item
  And   I add item to the basket




