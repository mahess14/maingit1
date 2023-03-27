Feature: Sample Scenario3

	
  Scenario Outline: 
    Given launch the chrome browser
    When Enter the url as "https://www.google.co.in"
    Then Enter "<word>" and click Enter
    And Verify the page title as "<word>"
    Then close browser
	
    Examples: 
      | word        |
      | temperature |
      | Ratan Tata  |
      | gold Rate   |
      | Magnitia    |
