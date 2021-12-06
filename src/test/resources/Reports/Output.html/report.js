$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Eclipse/Cucumber/src/test/resources/Features/Feature_Adactin.feature");
formatter.feature({
  "name": "Verification adactin booking",
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
});