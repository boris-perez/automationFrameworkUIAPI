Feature: Create bug

  @Smoke
  Scenario: Login validation
    Given TheUserName enter with teresa1 and sesame
    Then the bug main list is visible

  @Manual
  Scenario Outline: Create issues
    Given the user enter with teresa1 and sesame
    When creates new issue with <title>, <description>

    Examples:
      | title | description |
      | title | description |
