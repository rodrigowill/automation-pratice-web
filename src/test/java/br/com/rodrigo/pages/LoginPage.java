package br.com.rodrigo.pages;

import br.com.rodrigo.core.BasePage;

public class LoginPage extends BasePage{

	public void escreverEmailCriarConta() {
		this.aguardarElemento("email_create");
		this.escrever("email_create", "rodrigo1@teste.com");
	}

	public void clicarBotaoCreateAnAccount() {
		this.clicarBotao("SubmitCreate");
	}

	
	
}
