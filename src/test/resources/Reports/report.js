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
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...lo MyNewIDforTesting[!]\u003e but was:\u003c...lo MyNewIDforTesting[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefinitions.Step_Definition_Adactin.user_should_be_redirected_to_Home_page(Step_Definition_Adactin.java:38)\r\n\tat ✽.User should be redirected to Home page(E:/Eclipse/Cucumber/src/test/resources/Features/Feature_Adactin.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});