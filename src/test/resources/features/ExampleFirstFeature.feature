Feature: First Feature
  Scenario Outline: We are checking cucumber keywords
    Given This is Given <numbers>
    When This is "<strings>"
    Then This is Then

  Examples:
    |numbers|strings|
    |5      |Ahmet  |

