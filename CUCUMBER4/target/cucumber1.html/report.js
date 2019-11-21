$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FEATURE/TAGDEMO.feature");
formatter.feature({
  "name": "checking login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters admin as username",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password456 as password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user will   Finds a testmeapp admin page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});