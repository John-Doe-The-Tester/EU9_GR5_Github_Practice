Feature: Verify Tags Filter Functionality

    Scenario: Add a tag to a test case
        Given I am on the test case page
        When I add a tag to the test case
        Then the tag should be added to the test caseg a