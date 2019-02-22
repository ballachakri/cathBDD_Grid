$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("java/resources/search.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a end user\r\ni want to search for a product\r\nso that i can see all relevant products",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 13799544562,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "i am on the home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 9,
  "name": "valid search",
  "description": "",
  "id": ";valid-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "i search for  a product \" \u003cshirts \u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "i should see all the relevant products",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 185744130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " \u003cshirts \u003e",
      "offset": 25
    }
  ],
  "location": "SearchStepDef.i_search_for_a_product(String)"
});
formatter.result({
  "duration": 3819609,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.i_should_see_all_the_relevant_products()"
});
formatter.result({
  "duration": 37003,
  "status": "passed"
});
formatter.after({
  "duration": 2002158630,
  "status": "passed"
});
});