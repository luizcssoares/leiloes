package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	@Test
	public void dello() {
		System.setProperty("webdriver.chrome.driver","selenium/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.navigate().to("http://localhost:8080/leiloes");
		browser.quit();
	}
}
