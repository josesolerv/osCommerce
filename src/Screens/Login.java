package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	private String email;
	private String password;
	private WebDriver driver;
	
	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public void authentication() {
		WebElement emailInputElement = driver.findElement(By.cssSelector("table td.fieldValue input[type=\"text\"]"));
		emailInputElement.sendKeys(email);
		
		WebElement passwordInputElement = driver.findElement(By.cssSelector("table td.fieldValue input[type=\"password\"]"));
		passwordInputElement.sendKeys(password);
		
		WebElement signInButtonElement = driver.findElement(By.id("tdb1"));
		signInButtonElement.click();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
