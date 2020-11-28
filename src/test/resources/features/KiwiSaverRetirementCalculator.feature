# Created by ashika-mariasingam at 25/11/2020
Feature: KiwiSaver Retirement Calculator

  Scenario: Check contents for KiwiSaver Retirement Calculator
    Given User open browser and navigate to URL
    Then  Navigate to the KiwiSaver Retirement Calculator page
    When  I click on the information icon beside "Current Age"
    Then  Message is displayed

  Scenario Outline: Verify the KiwiSaver Retirement Calculations
    Given User open browser and navigate to URL
    Then  Navigate to the KiwiSaver Retirement Calculator page
    And   User enter Current Age as <Age>
    And   User choose Employment status "<EmploymentStatus>"
    And   User enters KiwiSaver balance as <KiwiSaverBalance>
    And   User enter Salary as <Salary>
    And   User enters Voluntary Contribution as <VoluntaryContribution> and <VoluntaryContributionFrequency>
    And   User choose KiwiSaver contribution as <KiwiContribution>
    And   User choose Risk profile as "<RiskProfile>"
    And   User enters Savings goals as <SavingGoals>
    When  User clicks the Complete form button
    Then  The correct results are displayed as <Results>

    Examples:
      | Age | EmploymentStatus | KiwiSaverBalance | Salary | VoluntaryContribution | VoluntaryContributionFrequency | KiwiContribution | RiskProfile  | SavingGoals | Results |
      | 30  | Employed         |                  | 82000  |                       |                                | 4                | Defensive    | 0           | 436365  |
      | 45  | Self-employed    | 100000           |        | 90                    | Fortnightly                    |                  | Conservative | 290000      | 259581  |
      | 55  | Not employed     | 140000           |        | 10                    | Annually                       |                  | Balanced     | 200000      | 260734  |