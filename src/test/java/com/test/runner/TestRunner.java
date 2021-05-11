package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.pwc.pulse.digital.step.definition"},
tags = { "@AllScenarios" },
monochrome=true,
plugin= {"pretty","html:Reports"})

public class TestRunner {

	}
