@ExpenseApp
Feature: Expense Tracking App Functionality

  Scenario: User Opens the Expense Tracking App
    Given the user opens the Expense Tracking Application

  Scenario: User Signs Up
    When the user signs up with valid credentials
    Then verifying if user has successfully registered by verifying that the user lands on the sign in page

  Scenario: User Signs In
    When the user signs in with valid credentials
    Then verifying if user has successfully signed in by verifying that the add expenses button is displayed

  Scenario: User Adds Expenses
    Given the user adds expenses with valid details
    Then verifying if expense added successfully by validating text of category is displayed after submitting the details

