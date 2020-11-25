# Created by ashika-mariasingam at 25/11/2020
Feature: KiwiSaver Retirement Calculator
  # Enter feature description here

  Scenario: Check contents for KiwiSaver Retirement Calculator
    Given Open browser
    And   Navigate to the KiwiSaver Retirement Calculator page
    When  I click on the information icon beside Current Age
    Then  Message is displayed
