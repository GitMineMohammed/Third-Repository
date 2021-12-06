@E2EBooking
Feature: Verification adactin booking

@loginPage
  Scenario Outline: Verification of Login page
    Given User should be in login page
    When User should enter "<userName>","<passWord>" and click Login button
    Then User should be redirected to Home page

    Examples: 
      | userName          | passWord      |
      | MyNewIdForTesting | Mohammed@1234 |

@searchHotelPage
  Scenario Outline: Verification of Search Hotel page
    Given User should be in Search Hotel page
    When User should enter "<location>","<hotel>","<roomType>","<roomNos>","<datepickin>","<datepickout>","<adultroom>","<childroom>" and click Search button
    And User should be redirected to Select Hotel Page
    And User should select existing hotel and click Continue button
    Then User should be redirected to Book A Hotel Page

    Examples: 
      | location | hotel          | roomType     | roomNos | datepickin | datepickout | adultroom | childroom |
      | Paris    | Hotel Sunshine | Super Deluxe | 1 - One | 10/12/2021 | 20/12/2021  | 4 - Four  | 4 - Four  |

@bookingPage
  Scenario Outline: Verification of Booking page
    Given User should be in booking page
    When User should enter "<firstName>","<lastName>","<billingAddress>","<ccNum>","<ccType>","<expiryMonth>","<expiryYear>" and "<cvvNum>"
    And User should click Book_Now button
    Then User should be redirected to Book A Hotel Page

    Examples: 
      | firstName | lastName | billingAddress | ccNum            | ccType | expiryMonth | expiryYear |
      | FirstName | LastName | Address        | 1234567890123456 | VISA   | January     |       2022 |
