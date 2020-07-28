package br.com.rodrigo.pages;

import br.com.rodrigo.core.BasePage;

public class LoginPage extends BasePage{

	public void escreverEmailCriarConta(String email) {
		this.aguardarElemento("email_create");
		this.escrever("email_create", email);
	}

	public void clicarBotaoCreateAnAccount() {
		this.clicarBotao("SubmitCreate");
	}

	public void escreverEmailAddress(String email) {
		this.escrever("email", email);
	}

	public void escreverPassword(String password) {
		this.escrever("passwd", password);
	}

	public void clicarSignIn() {
		this.clicarBotao("SubmitLogin");
	}

	
	
}
