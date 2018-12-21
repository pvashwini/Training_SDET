Feature: Verify the Title of our web Application 
   As acceptance tests we want to verify the title of our Home Page
   
Scenario: Verify the Title of the Home Page
   Given User is on the landing page
   When User checks the title
   Then it must say "Facebook - Log In or Sign Up"