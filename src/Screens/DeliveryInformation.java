package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ShippingMethod;

public class DeliveryInformation {
	private WebDriver driver;
	
	public void selectShippingMethod(ShippingMethod shippingMethod) {
		WebElement shippingMethodCheckboxElement = driver.findElements(By.cssSelector("input[type=\"radio\"]"))
												   .stream()
												   .filter(element -> element.getAttribute("value").equals(shippingMethod.getValue()))
												   .findFirst()
												   .orElse(null);
		
		if (shippingMethodCheckboxElement != null) {																						
			shippingMethodCheckboxElement.click();
		
			WebElement continueButtonElement = driver.findElement(By.id("tdb6"));
			continueButtonElement.click();
		}
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
