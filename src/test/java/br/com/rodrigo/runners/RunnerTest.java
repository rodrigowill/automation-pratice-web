package br.com.rodrigo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue = "br.com.rodrigo.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, // Criação de relatório em html e json
		monochrome = true
		)
public class RunnerTest {}