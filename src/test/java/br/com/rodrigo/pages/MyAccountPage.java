package br.com.rodrigo.pages;

import org.junit.Assert;

import br.com.rodrigo.core.BasePage;


public class MyAccountPage extends BasePage {

	public void validarCadastroComSucesso() {
		Assert.assertEquals("Fulano Silva", this.obterTextoPorNameClass("account"));
	}

	public void clicarSignOut() {
		this.clicarLink("Sign out");
	}

	public void validarLoginComSucesso() {
		Assert.assertEquals("MY ACCOUNT", this.obterTextoPorNameClass("page-heading"));		
	}

}
