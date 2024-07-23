@activity2
Feature: Login Test

  Scenario: Login Test
    Given User is on Login page
    When user enters "admin" and "password"
    Then Read the page title and confirmation page
    Then close the browser