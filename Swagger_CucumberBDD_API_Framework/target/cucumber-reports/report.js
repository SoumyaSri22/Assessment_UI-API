$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APostPet.feature");
formatter.feature({
  "line": 1,
  "name": "Add a new pet to store",
  "description": "I want to use this template for my feature file",
  "id": "add-a-new-pet-to-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User is able to add new pet to store",
  "description": "",
  "id": "add-a-new-pet-to-store;user-is-able-to-add-new-pet-to-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User send a valid POST request to add a pet",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user should get a success response code",
  "keyword": "Then "
});
formatter.match({
  "location": "PostReqStepDef.sendpost_Req()"
});
formatter.result({
  "duration": 5672797200,
  "status": "passed"
});
formatter.match({
  "location": "PostReqStepDef.validateputrespcode()"
});
formatter.result({
  "duration": 3241900,
  "status": "passed"
});
formatter.uri("BGetPet.feature");
formatter.feature({
  "line": 1,
  "name": "Get feature for pet",
  "description": "",
  "id": "get-feature-for-pet",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get details for existing pet by status",
  "description": "",
  "id": "get-feature-for-pet;get-details-for-existing-pet-by-status",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User send a valid GET request with given status",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify User should get a success response",
  "keyword": "Then "
});
formatter.match({
  "location": "GetReqStepDef.getresponse()"
});
formatter.result({
  "duration": 4058505800,
  "status": "passed"
});
formatter.match({
  "location": "GetReqStepDef.verify_getresponsecode()"
});
formatter.result({
  "duration": 173200,
  "status": "passed"
});
formatter.uri("Delete.feature");
formatter.feature({
  "line": 1,
  "name": "Delete a pet",
  "description": "I want to use this template for my feature file",
  "id": "delete-a-pet",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate user is able to Delete a pet",
  "description": "",
  "id": "delete-a-pet;validate-user-is-able-to-delete-a-pet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User sends a valid Delete request to delete a pet",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User gets a success response",
  "keyword": "Then "
});
formatter.match({
  "location": "DelReqStepDef.delReq()"
});
formatter.result({
  "duration": 1713010800,
  "status": "passed"
});
formatter.match({
  "location": "DelReqStepDef.verifyDelReqcode()"
});
formatter.result({
  "duration": 82100,
  "status": "passed"
});
formatter.uri("Getstore.feature");
formatter.feature({
  "line": 1,
  "name": "Find purchase order by ID",
  "description": "I want to use this template for my feature file",
  "id": "find-purchase-order-by-id",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Get purchase order by ID",
  "description": "",
  "id": "find-purchase-order-by-id;get-purchase-order-by-id",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User sends a GET request to get purchase order by ID",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User should get a valid response code",
  "keyword": "Then "
});
formatter.match({
  "location": "GetStoreStepDef.storegetReq()"
});
formatter.result({
  "duration": 1668186000,
  "status": "passed"
});
formatter.match({
  "location": "GetStoreStepDef.storesttatuscode()"
});
formatter.result({
  "duration": 90800,
  "status": "passed"
});
formatter.uri("Poststore.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase order for Pet",
  "description": "I want to use this template for my feature file",
  "id": "purchase-order-for-pet",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User is able to purchase order for pet",
  "description": "",
  "id": "purchase-order-for-pet;user-is-able-to-purchase-order-for-pet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User sends a POST Request to make a purchase",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user should get a valid response code",
  "keyword": "Then "
});
formatter.match({
  "location": "postStoreStepDef.sendpostreq()"
});
formatter.result({
  "duration": 1527873700,
  "status": "passed"
});
formatter.match({
  "location": "postStoreStepDef.verifystorecode()"
});
formatter.result({
  "duration": 88800,
  "status": "passed"
});
});