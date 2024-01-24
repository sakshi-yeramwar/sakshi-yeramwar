$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/LoginFiles/HerokuLogin.feature");
formatter.feature({
  "name": "Heroku Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Vaildate Username, Password and Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Open the browser and enter the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.open_the_browser_and_enter_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.validate_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enter_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user Password",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_user_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home Page should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.home_Page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});