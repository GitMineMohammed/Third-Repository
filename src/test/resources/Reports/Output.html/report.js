$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Eclipse/Cucumber/src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Verification of Adactin booking",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2EBooking"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verification of Login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginPage"
    }
  ]
});
formatter.step({
  "name": "User should be in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\",\"\u003cpassWord\u003e\" and click Login button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be redirected to Home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ]
    },
    {
      "cells": [
        "MyNewIdForTesting",
        "Mohammed@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of Login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2EBooking"
    },
    {
      "name": "@loginPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"MyNewIdForTesting\",\"Mohammed@1234\" and click Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_enter_and_click_Login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_redirected_to_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verification of Search Hotel page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@searchHotelPage"
    }
  ]
});
formatter.step({
  "name": "User should be in Search Hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003croomNos\u003e\",\"\u003cdatepickin\u003e\",\"\u003cdatepickout\u003e\",\"\u003cadultroom\u003e\",\"\u003cchildroom\u003e\" and click Search button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be redirected to Select Hotel Page",
  "keyword": "And "
});
formatter.step({
  "name": "User should select existing hotel and click Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be redirected to Book A Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomType",
        "roomNos",
        "datepickin",
        "datepickout",
        "adultroom",
        "childroom"
      ]
    },
    {
      "cells": [
        "Paris",
        "Hotel Sunshine",
        "Super Deluxe",
        "2",
        "10/12/2021",
        "20/12/2021",
        "4",
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of Search Hotel page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2EBooking"
    },
    {
      "name": "@searchHotelPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be in Search Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_in_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"Paris\",\"Hotel Sunshine\",\"Super Deluxe\",\"2\",\"10/12/2021\",\"20/12/2021\",\"4\",\"4\" and click Search button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_enter_and_click_Search_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to Select Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_redirected_to_Select_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select existing hotel and click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_select_existing_hotel_and_click_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_redirected_to_Book_A_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verification of final Booking page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@bookingPage"
    }
  ]
});
formatter.step({
  "name": "User should be in final booking page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cbillingAddress\u003e\",\"\u003cccNum\u003e\",\"\u003cccType\u003e\",\"\u003cccExpMonth\u003e\",\"\u003cccExpYear\u003e\",\"\u003ccvvNum\u003e\" and click Book_Now button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be redirected to Booking Confirmation Page",
  "keyword": "And "
});
formatter.step({
  "name": "User should get OrderId of Booked Hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "billingAddress",
        "ccNum",
        "ccType",
        "ccExpMonth",
        "ccExpYear",
        "cvvNum"
      ]
    },
    {
      "cells": [
        "UserFirstName",
        "UserLastName",
        "UserAddress",
        "1234567890123456",
        "VISA",
        "January",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verification of final Booking page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2EBooking"
    },
    {
      "name": "@bookingPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be in final booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_in_final_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"UserFirstName\",\"UserLastName\",\"UserAddress\",\"1234567890123456\",\"VISA\",\"January\",\"2022\",\"123\" and click Book_Now button",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_enter_and_click_Book_Now_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to Booking Confirmation Page",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_be_redirected_to_Booking_Confirmation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get OrderId of Booked Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition_Adactin.user_should_get_OrderId_of_Booked_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});