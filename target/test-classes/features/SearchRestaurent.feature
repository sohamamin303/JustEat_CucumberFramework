Feature: Use the website to find restaurants&nbsp; So that I can order food As a hungry customer.
I want to be able to find restaurants in my area


Scenario: Search for restaurants in an area
Given I want food in "AR51 1AA"
When I search for restaurants
Then I should see some restaurants in "AR51 1AA"



Scenario: Search for restaurants with wrong area code
Given Search for food in "AR509"
When I click on search button
Then I should see validation error message  "Please enter a full, valid postcode".



Scenario: Verify the Help Page
Given Search for Help link on HomePage
When click on the link 
Then verify the title of the HelpPage