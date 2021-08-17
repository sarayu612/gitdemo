Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on login link in homepage to land on secured signin Page
When User enters <username> and <password> and logs in
Then verify that user is successfully logged in
And close browsers
Examples:
|username                |password        |
|test99@gmail.com        |123456          |  
|sarayu612@gmail.com     |8331972393      |

