package br.com.rodrigo.steps;

import static br.com.rodrigo.core.DriverFactory.getDriver;

import br.com.rodrigo.pages.HomePage;
import br.com.rodrigo.pages.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	
	@Dado("^que estou cadastrado no ecommerce$")
	public void queEstouCadastradoNoEcommerce() throws Throwable {
		getDriver().get("http://automationpractice.com/index.php");
		home.clicarSignIn();
		login.escreverEmailCriarConta();
		login.clicarBotaoCreateAnAccount();
		
	}

	@Quando("^tento logar no site com o usuario criado$")
	public void tentoLogarNoSiteComUsuarioInvalido() throws Throwable {
		
	}

	@Então("^o resultado eh realizado com sucesso$")
	public void oResultadoEhAuthenticationFailed() throws Throwable {

	}
	
}
