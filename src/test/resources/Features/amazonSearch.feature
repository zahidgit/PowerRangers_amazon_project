
Feature: Amazon Search feature
  This feature will test amazon search feature

  @chrome @sanity @regression
  Scenario: Verify amazon search funcationality by searching on search box
    Given user is on the amazon home page
    When user enter "T-shirt" on the search box
    And click on search box
    Then user should able to go to T-shirt page
   

 