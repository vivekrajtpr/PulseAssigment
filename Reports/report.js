$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Pulse.feature");
formatter.feature({
  "name": "Verifying Home page presented with a carousel displaying Three featured articles.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllScenarios"
    }
  ]
});
formatter.scenario({
  "name": "Verifying after clicking on the Next button on the carousel should load the next 3 featured articles.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllScenarios"
    },
    {
      "name": "@Scenario01"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am viewing the \u0027Home\u0027 page",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_viewing_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with a carousel displaying 3 featured articles",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_presented_with_a_carousel_displaying_featured_articles(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the \u0027Next\u0027 button on the carousel will load the next 3 featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.clicking_the_button_on_the_carousel_will_load_the_next_featured_articles(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the \u0027Previous\u0027 button on the carousel will load the previous 3 featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.clicking_the_button_on_the_carousel_will_load_the_previous_featured_articles(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Contact us page details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllScenarios"
    },
    {
      "name": "@Scenario02"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Contact us\u0027 from the hamburger menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_select_from_the_hamburger_menu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the \u0027Contact us\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_taken_to_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with the below options for contacts",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_presented_with_the_below_options_for_contacts()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Performing a search functionality on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllScenarios"
    },
    {
      "name": "@Scenario03"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \u0027Magnifying glass\u0027 icon to perform a search",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_click_on_the_icon_to_perform_a_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the text \u0027Single page applications\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_enter_the_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the search",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_submit_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_taken_to_the_search_results_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with at least 1 search result",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PulseStepDefinitions.i_am_presented_with_at_least_search_result(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});