$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/PulseHomePage.feature");
formatter.feature({
  "name": "Verifying Home page presented with a carousel displaying Three featured articles.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegSuite"
    }
  ]
});
formatter.scenario({
  "name": "Verifying after clicking on the Next button on the carousel should load the next 3 featured articles.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegSuite"
    },
    {
      "name": "@Scenario001"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am viewing the Home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_viewing_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with a carousel displaying three featured articles",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_presented_with_a_carousel_displaying_featured_articles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the Next button on the carousel will load the next three featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the Previous button on the carousel will load the previous three featured articles",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles()"
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
      "name": "@RegSuite"
    },
    {
      "name": "@Scenario002"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Contact us from the hamburger menu",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_select_Contact_us_from_the_hamburger_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the Contact us page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_taken_to_the_Contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with the below options for contacts",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_presented_with_the_below_options_for_contacts()"
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
      "name": "@RegSuite"
    },
    {
      "name": "@Scenario003"
    }
  ]
});
formatter.step({
  "name": "I navigate to the PwC Digital Pulse website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_navigate_to_the_PwC_Digital_Pulse_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Magnifying glass icon to perform a search",
  "keyword": "When "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_click_on_the_Magnifying_glass_icon_to_perform_a_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the text Single page applications",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_enter_the_text_Single_page_applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the search",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_submit_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to the search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_taken_to_the_search_results_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am presented with at least 1 search result",
  "keyword": "And "
});
formatter.match({
  "location": "com.pwc.pulse.digital.step.definition.PwCPulseHomePage.i_am_presented_with_at_least_search_result(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});