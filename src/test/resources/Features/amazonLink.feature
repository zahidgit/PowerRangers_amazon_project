
Feature: Amazon link feature
  This feature will amazon link feature

  @chrome @sanity @regression
  Scenario: verify the amazon link 
    Given user is in the amazon homepage
    When user click on AmazonOutLet
    And click on Todays Deal 
    Then user should able to see all the todays deal
   

  