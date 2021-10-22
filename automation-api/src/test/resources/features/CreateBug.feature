Feature: Create bug

  @DataDriven
  Scenario: Login validation data driven
    Given the user enter userName and Password
    When send a POST request

  @SmokeAPI
  Scenario Outline: Login validation
    Given the user enter with <userName> and <password>
    When send a POST request
    Then the login is <status>

    Examples:
    |userName|password|status    |
    |juan1   |sesame  |successful|
    |juan12  |sesame  |failed    |
