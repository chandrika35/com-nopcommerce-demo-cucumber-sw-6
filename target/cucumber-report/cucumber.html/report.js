$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computer.feature");
formatter.feature({
  "line": 1,
  "name": "ComputerPage Test",
  "description": "As a user I want to arrange products and add them to shopping cart successfully",
  "id": "computerpage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7427505700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can arrange the products in alphabetical order",
  "description": "",
  "id": "computerpage-test;user-can-arrange-the-products-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on computer",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on desktop",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by position Name: Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the Product will arrange in Descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 84915000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnComputer()"
});
formatter.result({
  "duration": 923334300,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnDesktop()"
});
formatter.result({
  "duration": 827765200,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iSelectSortByPositionNameZToA()"
});
formatter.result({
  "duration": 119488400,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.verifyTheProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 33900,
  "status": "passed"
});
formatter.after({
  "duration": 679931200,
  "status": "passed"
});
formatter.uri("electronics.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Test",
  "description": "As a user I can navigate to any product page and place the order successfully",
  "id": "electronics-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2611077100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can navigate to cell phones page successfully",
  "description": "",
  "id": "electronics-test;user-can-navigate-to-cell-phones-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I can mouse hover on electronics tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can mouse hover on cell phones and click",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can verify the text \"Cell phones\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iCanMouseHoverOnElectronicsTab()"
});
formatter.result({
  "duration": 146826700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iCanMouseHoverOnCellPhonesAndClick()"
});
formatter.result({
  "duration": 900308200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 23
    }
  ],
  "location": "ElectronicsSteps.iCanVerifyTheText(String)"
});
formatter.result({
  "duration": 54381900,
  "status": "passed"
});
formatter.after({
  "duration": 619358200,
  "status": "passed"
});
formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Test",
  "description": "As a user I can navigate to various pages successfully",
  "id": "homepage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1661897300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can navigate to Computer page successfully",
  "description": "",
  "id": "homepage-test;user-can-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select computers",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Computers text displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iSelectComputers()"
});
formatter.result({
  "duration": 943299600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.computersTextDisplayed()"
});
formatter.result({
  "duration": 22752900,
  "status": "passed"
});
formatter.after({
  "duration": 639302800,
  "status": "passed"
});
});