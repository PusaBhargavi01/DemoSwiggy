Feature: Buy Food Online

Scenario: A user must be able to buy a food online
Given user enters the landing page
When he enters location as hyderabad and selects the first option from dropdown
And he clicks first restaurant shown under Top restaurant chains in Hyderabad
And  he Clicks on Add button corresponding to first listed dish.
And he Hover over Cart in the top right corner. 
And he clciks on Check Out in the sub-menu
Then he verify the text-"To place your order now, log in to your existing account or sign up."



