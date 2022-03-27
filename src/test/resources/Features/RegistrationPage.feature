Feature: Amazon registration feature
  This feature will test amazon registration features
  
  @chrome @sanity @regression
  Scenario: Verify customer login with valid userid and password
    Given user is in amazon login page
    When when user enters valid email address "zahid00nyc@gmail.com"
    And user enters valid phone number 
    Then user is navigated to amazom's homepage 