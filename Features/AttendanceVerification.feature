
Feature: Attandance Verfifcation Login + Open Calender + Montly Calender + Refresh

Scenario: AttandanceVerfifcation

#Pre-Condition
Given Open the HRMS Application
And Login to the HRMS Application

#Action
When Click on Calender bar
And Click on Current Month Link Label
And Click on Refresh

#Validation
Then Verify the Current Month Calender 


