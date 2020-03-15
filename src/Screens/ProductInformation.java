package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInformation {
	private WebDriver driver;
	
	public void addProductToCart() {
		WebElement addToCardButtonElement = driver.findElement(By.id("tdb4"));
		addToCardButtonElement.click();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
