$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GearTest.feature");
formatter.feature({
  "line": 2,
  "name": "Gear Test",
  "description": "",
  "id": "gear-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 8978044700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should be able to Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "gear-test;user-should-be-able-to-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Mouse Hover on Gear Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on Product Name Overnight Duffle",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Verifies text Overnight Duffle",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User changes quantity to 3",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User verifies the text You added Overnight Duffle to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks onShopping cart link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User verifies Product name",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User verifies Product Quantity",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Verifies Product price",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User changed quantity from 3 to 5.",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User updated Shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User verifies Product total price",
  "keyword": "Then "
});
formatter.match({
  "location": "GearTest.userIsOnHomepage()"
});
formatter.result({
  "duration": 431733100,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 1219747300,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userClicksOnBags()"
});
formatter.result({
  "duration": 2043790800,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userClickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 2022675400,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userVerifiesTextOvernightDuffle()"
});
formatter.result({
  "duration": 605545400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "GearTest.userChangesQuantityTo(int)"
});
formatter.result({
  "duration": 367450200,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userClicksOnAddToCartButton()"
});
formatter.result({
  "duration": 249540600,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userVerifiesTheTextYouAddedOvernightDuffleToYourShoppingCart()"
});
formatter.result({
  "duration": 1425389400,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userClicksOnShoppingCartLink()"
});
formatter.result({
  "duration": 1925985800,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userVerifiesProductName()"
});
formatter.result({
  "duration": 375730200,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userVerifiesProductQuantity()"
});
formatter.result({
  "duration": 706040700,
  "status": "passed"
});
formatter.match({
  "location": "GearTest.userVerifiesProductPrice()"
});
formatter.result({
  "duration": 48850600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "GearTest.userUpdatedShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearTest.userVerifiesProductTotalPrice()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1127232700,
  "status": "passed"
});
});