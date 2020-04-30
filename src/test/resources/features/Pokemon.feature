@Web
  Feature: Search Pokemon
    Scenario: Search Article about Pokemon on Google
      Given User open google home page
      When User input Search Pokemon "Pikachu Wikipedia Indonesia" and click Enter
      Then User click the first search result
      And User go to the wikipedia article
      And User verify that pokemon name is same as API
      Then USer verify that pokemon number is same as API