@tag1_mobile
Feature: Validate the mobile in the application

  Background: 
    Given Login to the Application

  Scenario: Validate the new model in OnePlus
    When Select the Electronic module
    And Select the Mobile oneplus mobile
    Then Validate the mobile in the add to cart
