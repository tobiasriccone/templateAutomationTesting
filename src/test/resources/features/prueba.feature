@regression
@googleTests
Feature: Google feature
Rule: Testing the searching of Google Page

  Background:
    Given the user enter in google

  @smoke
  Scenario: The user clicks 'Voy a tener suerte' button
    When the user clicks Voy a tener suerte button
    Then the Doodles page is showing

  @priority
  Scenario: The user clicks 'Busqueda por imagen' button
    When the user clicks Busqueda por imagen button
    Then the option to search by image is showing