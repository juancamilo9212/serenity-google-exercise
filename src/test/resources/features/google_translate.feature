#Author: juan.camargo@sofka.com.co

  Feature:Google Translate
    As a web user
    I want to user google translate
    to translate words between different languages

    Scenario: translate from english to spanish
      Given that Juan wants to translate a word
      When she translates the word "cheese" from english to spanish
      Then she should see the word "queso" in the screen

