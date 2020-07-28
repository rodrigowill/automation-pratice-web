package br.com.rodrigo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue = "br.com.rodrigo.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false // não executa o codigo dos metodos quando 'true', apenas valida as associacoes
		)
public class RunnerTest {	
	
}
