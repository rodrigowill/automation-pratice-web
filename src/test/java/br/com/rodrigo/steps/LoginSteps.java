package br.com.rodrigo.steps;

import static br.com.rodrigo.core.DriverFactory.getDriver;
import static br.com.rodrigo.core.DriverFactory.killDriver;

import br.com.rodrigo.core.Utils;
import br.com.rodrigo.pages.CreateLoginPage;
import br.com.rodrigo.pages.HomePage;
import br.com.rodrigo.pages.LoginPage;
import br.com.rodrigo.pages.MyAccountPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	
	HomePage home = new HomePage();
	LoginPage login = new LoginPage();
	CreateLoginPage createLogin = new CreateLoginPage();
	MyAccountPage myAccount = new MyAccountPage();
	
	String email;
	String password = "123456789";
	
	@Dado("^que estou cadastrado no ecommerce$")
	public void queEstouCadastradoNoEcommerce() throws Throwable {
		
		getDriver().get("http://automationpractice.com/index.php");
		
		home.clicarSignIn();
		
		email = Utils.getSaltString() + "@teste15.com.br";
		
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

	@Entao("^o login eh realizado com sucesso$")
	public void oLoginEhRealizadoComSucesso() throws Throwable {
		myAccount.validarLoginComSucesso();
		killDriver();
	}
	
	@Dado("^que estou na tela de login$")
	public void queEstouNaTelaDeLogin() throws Throwable {
		getDriver().get("http://automationpractice.com/index.php");
		home.clicarSignIn();
	}

	@Quando("^tento logar no site com um e-mail invalido$")
	public void tentoLogarNoSiteComUmEMailInvalido() throws Throwable {
		login.escreverEmailAddress("fulano.com.br");
		login.escreverPassword(password);
		login.clicarSignIn();
	}

	@Entao("^valido uma mensagem de e-mail invalido$")
	public void validoUmaMensagemDeEMailInvalido() throws Throwable {
		login.validarMensageEmailInvalido();
		killDriver();
	}

	@Quando("^tento logar sem preencher o e-mail$")
	public void tentoLogarSemPreencherOEMail() throws Throwable {
		login.escreverEmailAddress("");
		login.escreverPassword(password);
		login.clicarSignIn();
	}

	@Entao("^valido uma mensagem de e-mail obrigatorio$")
	public void validoUmaMensagemDeEMailObrigatorio() throws Throwable {
		login.validarMensageEmailObrigatorio();
		killDriver();
	}
	
}
