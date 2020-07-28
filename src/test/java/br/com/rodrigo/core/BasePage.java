package br.com.rodrigo.core;

import static br.com.rodrigo.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void aguardarElemento(String id_campo) {
		FluentWait wait = new FluentWait(getDriver()).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_campo)));
	}
	
	/******** Link *********/
	
	public void clicarLink (String link) {
		getDriver().findElement(By.linkText(link)).click();
	}
	
	/******** Texto ********/	
	
	public String obterTextoPorNameClass(String class_campo) {
		return getDriver().findElement(By.className(class_campo)).getText();
	}
	
	public String obterTextoPorXpath(String elemento) {
		return getDriver().findElement(By.xpath(elemento)).getText();
	}
	
	/******** TextField e TextArea *********/
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
	
	public void limparInputPorId(String id_campo) {
		getDriver().findElement(By.id(id_campo)).clear();
	}
	
	/******** Botão *********/
	
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarBotao(String id_campo) {
		clicarBotao(By.id(id_campo));
	}

	/******** Radio e Check *********/
	
	public void clicarRadio(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarRadio(String id) {
		clicarRadio(By.id(id));
	}
	
	/******** Combo *********/
	
	public void selecionarCombo(String id, String valor) {
		WebElement elemento = getDriver().findElement(By.id(id));
		Select combo = new Select(elemento);
		combo.selectByVisibleText(valor);
	}
	
}
