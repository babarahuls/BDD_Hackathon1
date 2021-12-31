Feature: Title of your feature

Scenario: Launch
Given Launch the url
When user enter username and password
Then click on Login
When user enter Address
And click on Logout

Scenario: Verify order
Given Launch the url
When user enter username and password
And click on Login
When user click on Details and Go to Order History
Then user click on the Order cancellation
And click on Logout

Scenario: User sends message
Given Launch the url
When user click on Menu
Then user clicks on contact
And user sends a message