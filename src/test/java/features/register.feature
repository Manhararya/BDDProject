Feature: register
  @register
  Scenario: As a user, I should able to register successfully
  so that, I can use all user features

    Given I am on registration page
    When I enter required registration details with timestamp
    Then I should able to register successfully
#    When I Click on "Register" button
