package br.com.rodrigo.pages;

import br.com.rodrigo.core.BasePage;

public class CreateLoginPage extends BasePage{

	public void selecionarTitle() {
		this.aguardarElemento("id_gender1");
		this.clicarRadio("id_gender1");
	}

	public void escreverFirstName() {
		this.escrever("customer_firstname", "Fulano");
	}

	public void escreverLastName() {
		this.escrever("customer_lastname", "Silva");
	}

	public void escreverPassword(String password) {
		this.escrever("passwd", password);
	}

	public void escreverAddress() {
		this.escrever("address1", "Time Square Avenue, 1234");		
	}

	public void escreverCity() {
		this.escrever("city", "New York");
	}

	public void selecionarState() {
		this.selecionarCombo("id_state", "New York");
	}

	public void escreverPostalCode() {
		this.escrever("postcode", "22222");
	}

	public void escreverMobilePhone() {
		this.escrever("phone_mobile", "12345678908");
	}

	public void escreverAddressAlias() {
		this.limparInputPorId("alias");
		this.escrever("alias", "Address Alias");
	}

	public void clicarRegister() {
		this.clicarBotao("submitAccount");
	}

}
