package Screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.Product;

public class ProductSelection {
	private WebDriver driver;
	
	public void selectProduct(Product product) {
		List<WebElement> elements = driver.findElements(By.cssSelector("table td a"));
		WebElement selectedProduct = elements.stream()
										     .filter(element -> element.getText().contains(product.getName()))
										     .findFirst()
										     .orElse(null);
		if (selectedProduct != null) {
			selectedProduct.click();
		}
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
