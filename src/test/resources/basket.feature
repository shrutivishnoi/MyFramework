@run
Feature: basket
  #shopping basket features
  @web
  Scenario: add to basket
    Given that i am on the shopping website
    When i add an item to the basket
    Then i can view the item in my basket



  @mobile
  Scenario: add to basket1
    Given that i am on the shopping website1
    When i add an item to the basket1
    Then i can view the item in my basket1



  @test
  Scenario: add to vasket
    Given that i am on the shopping vasket
    When i add an item to the vasket
    Then i can view the item in my vasket