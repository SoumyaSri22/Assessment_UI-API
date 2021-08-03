$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into Application",
  "description": "",
  "id": "login-into-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate user is able to login in",
  "description": "",
  "id": "login-into-application;validate-user-is-able-to-login-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate user is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.User_opens_browser()"
});
formatter.result({
  "duration": 28666046700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_is_on_Log_in_page()"
});
formatter.result({
  "duration": 2133310800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.User_logs_into_app()"
});
formatter.result({
  "duration": 4334540600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.validateusername()"
});
formatter.result({
  "duration": 2323357200,
  "status": "passed"
});
formatter.uri("B_InvalidCred.feature");
formatter.feature({
  "line": 2,
  "name": "Invalid Credentials login",
  "description": "",
  "id": "invalid-credentials-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Unsuccessful login with invalid Credentials",
  "description": "",
  "id": "invalid-credentials-login;unsuccessful-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens browser to login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Log in screen",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter invalid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Appropriate error message is seen",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCredStepDefinitions.User_opens_browser()"
});
formatter.result({
  "duration": 24963082200,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCredStepDefinitions.User_is_on_Login()"
});
formatter.result({
  "duration": 2085961700,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCredStepDefinitions.invalid_credentials()"
});
formatter.result({
  "duration": 4539838600,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCredStepDefinitions.error_message()"
});
formatter.result({
  "duration": 3286498400,
  "status": "passed"
});
formatter.uri("C_Order.feature");
formatter.feature({
  "line": 2,
  "name": "Order Confirmation",
  "description": "",
  "id": "order-confirmation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User is able to place an order",
  "description": "",
  "id": "order-confirmation;user-is-able-to-place-an-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens Demo Blaze app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User adds one item from monitor category",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User navigates to Cart page and place order",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters all details in the pop up and purchase",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User gets an order confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderForRegisterStepDefinition.user_opens_browser()"
});
formatter.result({
  "duration": 25977983000,
  "status": "passed"
});
formatter.match({
  "location": "OrderForRegisterStepDefinition.monitor_category()"
});
formatter.result({
  "duration": 2077887800,
  "status": "passed"
});
formatter.match({
  "location": "OrderForRegisterStepDefinition.navigates_to_cart_page()"
});
formatter.result({
  "duration": 4026149000,
  "status": "passed"
});
formatter.match({
  "location": "OrderForRegisterStepDefinition.all_details()"
});
formatter.result({
  "duration": 4818332400,
  "status": "passed"
});
formatter.match({
  "location": "OrderForRegisterStepDefinition.order_confirmation()"
});
formatter.result({
  "duration": 2816057700,
  "status": "passed"
});
formatter.uri("DeleteItems.feature");
formatter.feature({
  "line": 1,
  "name": "Delete items from cart",
  "description": "",
  "id": "delete-items-from-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Deletes items from cart",
  "description": "",
  "id": "delete-items-from-cart;user-deletes-items-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User has some items in cart present",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigates to cart page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Delete button for an item",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate user is on cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteItemStepDefinitions.User_has_items()"
});
formatter.result({
  "duration": 27539835100,
  "status": "passed"
});
formatter.match({
  "location": "DeleteItemStepDefinitions.User_navigates_to_cart_page()"
});
formatter.result({
  "duration": 3218782400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteItemStepDefinitions.User_clicks_on_Delete()"
});
formatter.result({
  "duration": 5168735000,
  "status": "passed"
});
formatter.match({
  "location": "DeleteItemStepDefinitions.verify_Title()"
});
formatter.result({
  "duration": 1201805500,
  "status": "passed"
});
formatter.uri("SignUp.feature");
formatter.feature({
  "line": 2,
  "name": "Sign Up for new User",
  "description": "",
  "id": "sign-up-for-new-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "New User is able to Sign Up",
  "description": "",
  "id": "sign-up-for-new-user;new-user-is-able-to-sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters unique username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.opens_browser()"
});
formatter.result({
  "duration": 24847850000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitions.sign_up()"
});
formatter.result({
  "duration": 1217466200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinitions.enters_username_password()"
});
formatter.result({
  "duration": 4654332700,
  "status": "passed"
});
});