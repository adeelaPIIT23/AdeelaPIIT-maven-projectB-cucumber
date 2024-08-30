Feature: User Registration on Tutorials Ninja

Scenario: Register a new user with valid details
  Given User is on the Tutorials Ninja home page
  When User navigates to the Registration page
  And User enters first name as "Adeela"
  And User enters last name as "Bootcamp"
  And User enters email as "adeela_piitbootcamp22994e@gmail.com"
  And User enters telephone as "473573219"
  And User enters password as "HybridF@123"
  And User confirms the password as "HybridF@123"
  And User agrees to the terms and conditions
  Then User clicks on the Continue button
  And Registration should be successful
