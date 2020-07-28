package br.com.rodrigo.steps;

import static br.com.rodrigo.core.DriverFactory.getDriver;
import static br.com.rodrigo.core.DriverFactory.killDriver;

import br.com.rodrigo.core.BaseSteps;
import br.com.rodrigo.pages.CreateLoginPage;
import br.com.rodrigo.pages.HomePage;
import br.com.rodrigo.pages.LoginPage;
import br.com.rodrigo.pages.MyAccountPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps extends BaseSteps {
	
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	CreateLoginPage createLogin = new CreateLoginPage();
	MyAccountPage myAccount = new MyAccountPage();
	
	String email = "fulano12@teste15.com";
	String password = "123456789";
	
	@Dado("^que estou cadastrado no ecommerce$")
	public void queEstouCadastradoNoEcommerce() throws Throwable {
		
		getDriver().get("http://automationpractice.com/index.php");
		
		home.clicarSignIn();
		
		login.escreverEmailCriarConta(email);
		login.clicarBotaoCreateAnAccount();
		
		createLogin.selecionarTitle();
		createLogin.escreverFirstName();
		createLogin.escreverLastName();
		createLogin.escreverPassword(password);
		createLogin.escreverAddress();
		createLogin.escreverCity();
		createLogin.selecionarState();
		createLogin.escreverPostalCode();
		createLogin.escreverMobilePhone();
		createLogin.escreverAddressAlias();
		createLogin.clicarRegister();
		
		myAccount.clicarSignOut();
	}

	@Quando("^tento logar no site com o usuario criado$")
	public void tentoLogarNoSiteComUsuarioCriado() throws Throwable {
		home.clicarSignIn();
		login.escreverEmailAddress(email);
		login.escreverPassword(password);
		login.clicarSignIn();
	}

	@Então("^o login eh realizado com sucesso$")
	public void oLoginEhRealizadoComSucesso() throws Throwable {
		myAccount.validaLoginComSucesso();
		killDriver();
	}
	
}
