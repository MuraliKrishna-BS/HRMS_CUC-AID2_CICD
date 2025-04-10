
Feature: HRMS Pending Approvals

Scenario: VerifyPendingApproval

#Pre-Condition
Given Login to the HRMS Application

#Action
When Click on Self Service Button
And Click on Forms Pending for Approval
And Select the Record for Approval
And Enter the Apporval Text as Approved

#Validation
Then Verify Record is Approved