Feature: Recruitment Process

  Scenario: Add a new candidate
    Given the user is logged in
    When the user adds a new candidate with first name "John", last name "Doe", and email "john.doe@example.com"
    Then the candidate should be added successfully with status "Hired"
