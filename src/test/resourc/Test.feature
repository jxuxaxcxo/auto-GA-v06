Feature: Accounts administration
  Scenario: Create Account
      Given Account name filled
      And Account description filled
      Then Click Add Button

  Scenario: See Account Details
      Given Table row selected
      Then Click Detail Button