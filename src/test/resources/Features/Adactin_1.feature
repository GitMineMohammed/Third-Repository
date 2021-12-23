
@E2EBooking
Feature: Verification of Adactin booking1

  @loginPage
  Scenario: Verification of Login page
    Given User should be in login page
    When User should enter credentials and click Login button
      | userName | MyNewIdForTesting |
      | passWord | Mohammed@1234     |
    Then User should be redirected to Home page

  @searchHotelPage
  Scenario: Verification of Search Hotel page
    Given User should be in Search Hotel page
    When User should enter location, hotel, roomType, roomNos, checkIn, checkOut, adultRoom, childRoom and click Search button
    And User should be redirected to Select Hotel Page
    And User should select existing hotel and click Continue button
    Then User should be redirected to Book A Hotel Page

  @bookingPage
  Scenario Outline: Verification of final Booking page
    Given User should be in final booking page
    When User should enter "<firstName>","<lastName>","<billingAddress>","<ccNum>","<ccType>","<ccExpMonth>","<ccExpYear>","<cvvNum>" and click Book_Now button
    And User should be redirected to Booking Confirmation Page
    Then User should get OrderId of Booked Hotel

    Examples: 
      | firstName     | lastName     | billingAddress | ccNum            | ccType | ccExpMonth | ccExpYear | cvvNum |
      | UserFirstName | UserLastName | UserAddress    | 1234567890123456 | VISA   | January    |      2022 |    123 |
