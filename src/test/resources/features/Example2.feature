Feature: Sample Scenario1

  Scenario: Google
    Given launch the chrome browser
    When Enter the url as "https://www.google.co.in"
    Then Verify the Title as "Google"
    Then close browser

  Scenario: Sample Scenario2
    Given launch the chrome browser
    When Enter the url as "https://www.google.co.in"
    Then Enter "Ratan Tata" and click Enter
    And Verify the page title as "Ratan Tata"
    Then quit browser