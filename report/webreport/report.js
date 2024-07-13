$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "valid login feature for saucedemo labs",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login_valid"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters below credentials header\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be navigated to the  homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 11,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 12,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;3"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ],
      "line": 13,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login_valid"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters below credentials header\"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be navigated to the  homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login_valid"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters below credentials header\"problem_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be navigated to the  homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@login_valid"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters below credentials header\"performance_glitch_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be navigated to the  homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@login_invalid"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters below credentials header\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user should be locked in the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 22,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;1"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce"
      ],
      "line": 23,
      "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "login function data driven",
  "description": "",
  "id": "valid-login-feature-for-saucedemo-labs;login-function-data-driven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 15,
      "name": "@login_invalid"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters below credentials header\"locked_out_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "clicked login button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user should be locked in the homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});