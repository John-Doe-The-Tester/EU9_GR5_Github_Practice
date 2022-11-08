package com.eu9gr5.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"html:target/failed-html-report"},
		features = "@target/rerun.txt",
		glue = "com/eu9gr4/step_definitions"
)

public class FailedTestRunner {
}
