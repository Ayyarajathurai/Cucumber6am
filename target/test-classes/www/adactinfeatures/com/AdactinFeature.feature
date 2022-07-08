Feature: Adaction Hotel Booking Application
Scenario: Login Functionality
Given user Lanuch The Adactin Application
When user Enter The Username In Inputbx
And user Enter The Password In Inputbx
Then user ClickOn The LoginBtn Its Navigate To SearchHotel

Scenario: search Functionality
When user Select The Loaction From The Dropdown 
And user Selects the Hotel From The Dropdown
And user Selects the Room_Type from Dropdown
And user Selects The Number Of Rooms from Dropdown
And user Enter the DateCheckIn In InputBx
And User Enter The DateCheckOUt In InputBx
And user Selects The Adults Per Room In Dropdown
And user Selects The Children Per Room In Dropdown
Then user ClickOn  Search Button Its Navigate To SelectHotel

Scenario: select Functionality
When User select The Hotel From CheckBx
Then user ClickOn ContinueBtn Its Navigate to BookHotel

Scenario: BookHotel Functionality
When user Enter The FirstName In InputBx
And user Enter The LastNAme In InputBx
And User Enter The BillingAddress In InputBX
And user Enter The Credit Card No In InputBx
And user Selects The CardType From DropDown
And user Selects The ExpiryDate Month From Dropdown
And user Selects The ExpiryDate Date from Dropdown
And user Enter the CVV Number In InputBx
Then user ClickOn BookNowBtn Its NAvigate to BookingConfirmation

Scenario: Booking Confirmation
Then user ClickOn LogOutBtn Its Navigate to Adactin Home Page
 

