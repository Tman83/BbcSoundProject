Feature: Sounds Homepage

  As a user
  I should not be allowed to access content without being prompted
  to sign in

  Background:
    Given that I am on the BBC Sounds Homepage


  Scenario: To access podcast content user is prompted to sign in
    When I select the ‘Podcast’ logo
    Then I am on the 'Podcast' page
    Then I click the first option under 'trending this week'
    Then I click on the play logo
    And I can see the sign in or register prompt

  Scenario: To access podcast content user is prompted to sign in
    When I select the ‘Music’ logo
    Then I am on the 'Music' page
    Then I click the first option under 'back to back sound'
    Then I click on the play all link
    Then I click the play button
    And I can see the sign in or register prompt

  Scenario: To access podcast content user is prompted to sign in
    When I select the ‘Home’ logo
    Then I am on the 'Home' page
    Then I select the 'Rock & Indie' category
    Then I am on the 'Rock & Indie' page
    Then I scroll down to the page 3 link
    Then I click on page 3 link
    Then I scroll down to 'Metal at 40'
    Then I click 'Metal at 40'
    And I can see the sign in or register prompt