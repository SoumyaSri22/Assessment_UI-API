$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/DeleteItems.feature");
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
  "description": "Given: User has some items in cart present\r\nWhen: User navigates to cart page\r\nThen: User clicks on Delete button for an item\r\nThen: Item should be deleted from queue",
  "id": "delete-items-from-cart;user-deletes-items-from-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.uri("features/InvalidCred.feature");
formatter.feature({
  "line": 1,
  "name": "Invalid Credentials",
  "description": "",
  "id": "invalid-credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Unsuccessful Login with Invalid credentials",
  "description": "",
  "id": "invalid-credentials;unsuccessful-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opens browser to login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Log in screen",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enter invalid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Appropriate error message is seen",
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
formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with Valid Credentials",
  "description": "",
  "id": "application-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Home Page is dispalyed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate logged in username",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("features/NoDetails.feature");
formatter.feature({
  "line": 1,
  "name": "User purchase item without giving details",
  "description": "",
  "id": "user-purchase-item-without-giving-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User clicks on Purchase button before entering the mandatory details",
  "description": "Given: User has items in cart \r\nWhen: User clicks on Place order button\r\nThen: Customer details pop up is seen\r\nThen: User clicks on Purchase button",
  "id": "user-purchase-item-without-giving-details;user-clicks-on-purchase-button-before-entering-the-mandatory-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.uri("features/OrderForRegister.feature");
formatter.feature({
  "line": 1,
  "name": "Order Confirmation For Registered user",
  "description": "",
  "id": "order-confirmation-for-registered-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Order Journey for Registered users",
  "description": "Given: User is already logged it\r\nWhen: User adds one item from laptop category\r\nThen: User navigates to Cart page and place order\r\nAnd: User enters all details in the pop up and purchase\r\nThen: User gets an order confirmation popup",
  "id": "order-confirmation-for-registered-user;order-journey-for-registered-users",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.uri("features/SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up Functionality",
  "description": "",
  "id": "sign-up-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sign Up functioanlity for new user",
  "description": "",
  "id": "sign-up-functionality;sign-up-functioanlity-for-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Sign Up page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User enters unique username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Sign Up button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "New user logs into website",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
});