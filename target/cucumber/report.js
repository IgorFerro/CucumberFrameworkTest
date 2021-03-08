$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CucumberFramework/featureFiles/EnterVehicleData.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Enter Vehicle Data",
  "description": "Enter a Valid Data For Vehicle",
  "id": "enter-vehicle-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 5758076700,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Enter Vehicle Data",
  "description": "",
  "id": "enter-vehicle-data;enter-vehicle-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@EnterVehicleData"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User navigates to tricentis vehicle insurance application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User fill the form with valid data",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User clicks on the next button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Insurant data form is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User fill the Insurant form with valid data",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User fill the Product form with valid data",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User select Price",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User send Quotes",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Insurance data was successfully sent",
  "keyword": "Then "
});
formatter.match({
  "location": "EnterVehicleData.user_navigates_to_tricentis_vehicle_insurance_application()"
});
formatter.result({
  "duration": 3767223300,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_fill_the_form_with_valid_data()"
});
formatter.result({
  "duration": 3394345300,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_clicks_on_the_next_button()"
});
formatter.result({
  "duration": 366216900,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.insurant_data_form_is_displayed()"
});
formatter.result({
  "duration": 39796800,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_fill_the_Insurant_form_with_valid_data()"
});
formatter.result({
  "duration": 2468741900,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_fill_the_Product_form_with_valid_data()"
});
formatter.result({
  "duration": 2150076000,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_select_Price()"
});
formatter.result({
  "duration": 1101624900,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.user_send_Quotes()"
});
formatter.result({
  "duration": 1093856900,
  "status": "passed"
});
formatter.match({
  "location": "EnterVehicleData.insurance_data_was_successfully_sent()"
});
formatter.result({
  "duration": 8525583600,
  "status": "passed"
});
formatter.after({
  "duration": 5836438500,
  "status": "passed"
});
});