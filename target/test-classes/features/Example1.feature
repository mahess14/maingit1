@smoketest
Feature: Send Email

  Scenario: Sample
    Given launch chrome browser
    Then Enter url as "https://www.gmail.com"
    Then Enter username as "testing15122021@gmail.com" and password as "Testing1512"
    When click on compose button and fill all fields with data
      | To                           | Subject | Message Body | Attachment                                             |
      | akkikumar.m@gmail.com        | wishes  | Happy pongal | C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData.xlsx |
      | subhashini2cool@gmail.com    | wishes  | Happy pongal | C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData.xlsx |
      | Shaikanusha40@gmail.com      | wishes  | Happy pongal | C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData.xlsx |
      | prasannajesslyn217@gmail.com | wishes  | Happy pongal | C:\\Users\\Rami Reddy\\Desktop\\Batches\\TestData.xlsx |
    Then do logout