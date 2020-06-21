$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to TestYou",
  "description": "",
  "id": "login-to-testyou",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login to TestYou",
  "description": "",
  "id": "login-to-testyou;login-to-testyou",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter Login Id in the Login Field",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Enter Password in the Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify user login successfully",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Logout from the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginDef.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 34486069306,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.enter_Login_Id_in_the_Login_Field()"
});
formatter.result({
  "duration": 821623341,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.enter_Password_in_the_Password()"
});
formatter.result({
  "duration": 225337985,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.click_on_Login_Button()"
});
formatter.result({
  "duration": 5847500862,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.verify_user_login_successfully()"
});
formatter.result({
  "duration": 142949167,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.logout_from_the_application()"
});
formatter.result({
  "duration": 12624968516,
  "status": "passed"
});
});