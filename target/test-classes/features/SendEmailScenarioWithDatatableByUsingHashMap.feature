Feature: Send Mail
Scenario:
	Given  chrome browser
	And launch using "http://www.gmail.com"
	When login using "testing15122021" and "15122021" as credentials
	Then compose button is Displayed
	When click  compose and fill data from data table values
	|To|Subject|Description|Attachment|
	|ramireddy234@gmail.com|wishes|Hi Ram|C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData\\TestData.txt|
	|testing15122021@gmail.com|wishes|Hi Rami|C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData\\TestData.txt|
	|tummala.ramireddy234@gmail.com|wishes|Hi Raja|C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData\\TestData.txt|
	Then "Message Sent" message should be displayed
	When do logout the page
	Then login page should be available  
	When close the site