# Created by ashika-mariasingam at 25/11/2020
Feature: KiwiSaver Retirement Calculator

  @scenario1
  Scenario: Check content for Current Age in KiwiSaver Retirement Calculator
    Given User opens browser and navigates to Website
    And   User navigates to the KiwiSaver Retirement Calculator page
    When  User clicks on the information icon besides "Current Age"
    Then  Informative message is displayed

  @scenario2
  Scenario Outline: Verify the KiwiSaver Retirement Calculations
    Given User opens browser and navigates to Website
    And   User navigates to the KiwiSaver Retirement Calculator page
    And   User enters Current Age as <Age>
    And   User selects Employment status "<EmploymentStatus>"
    And   User enters KiwiSaver balance as <KiwiSaverBalance>
    And   User enters Salary as <Salary>
    And   User enters Voluntary Contribution as <VoluntaryContribution> and <VoluntaryContributionFrequency>
    And   User selects KiwiSaver contribution as <KiwiContribution>
    And   User selects Risk profile as "<RiskProfile>"
    And   User enters Savings goals as <SavingGoals>
    When  User clicks the Complete the form button
    Then  The result is displayed as <Result>

    Examples:
      | Age | EmploymentStatus | KiwiSaverBalance | Salary | VoluntaryContribution | VoluntaryContributionFrequency | KiwiContribution | RiskProfile  | SavingGoals | Result |
      | 30  | Employed         |                  | 82000  |                       |                                | 4                | Defensive    | 0           | 436365  |
      | 45  | Self-employed    | 100000           |        | 90                    | Fortnightly                    |                  | Conservative | 290000      | 259581  |
      | 55  | Not employed     | 140000           |        | 10                    | Annually                       |                  | Balanced     | 200000      | 260734  |