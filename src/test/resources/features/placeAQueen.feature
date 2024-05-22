Feature: Placer une reine
  Placer une reine sur l'échiquier

  Scenario: Placer une reine en 0, 0
    Given un echiquier
    When placer une reine en 0, 0
    Then 1 reine sur l'échiquier