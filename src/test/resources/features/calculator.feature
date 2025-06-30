Feature: Calculator API

  Scenario: Add two numbers
    Given I send a GET request to "/api/add/5/3"
    Then the response should be "8"

  Scenario: Subtract two numbers
    Given I send a GET request to "/api/subtract/5/3"
    Then the response should be "2"

  Scenario: Multiply two numbers
    Given I send a GET request to "/api/multiply/5/3"
    Then the response should be "15"

  Scenario: Divide two numbers
    Given I send a GET request to "/api/divide/6/3"
    Then the response should be "2"

  Scenario: Hello World endpoint
    Given I send a GET request to "/api/hello"
    Then the response should be "Hello, World!"