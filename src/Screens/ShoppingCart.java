package Screens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.Product;

public class ShoppingCart {
	private WebDriver driver;
	
	public void checkout(Product product) {
		WebElement quantityInputElement = driver.findElement(By.cssSelector("input[name=\"cart_quantity[]\"]"));
		quantityInputElement.clear();
		quantityInputElement.sendKeys(product.getQuantity().toString());
		
		WebElement updateButtonElement = driver.findElement(By.id("tdb4"));
		updateButtonElement.click();
		
		quantityInputElement = driver.findElement(By.cssSelector("input[name=\"cart_quantity[]\"]"));
		assertEquals(product.getQuantity().toString(), quantityInputElement.getAttribute("value"));
		
		WebElement checkoutButtonElement = driver.findElement(By.id("tdb5"));
		checkoutButtonElement.click();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
