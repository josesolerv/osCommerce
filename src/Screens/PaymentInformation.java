package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.PaymentMethod;

public class PaymentInformation {
	private WebDriver driver;
	
	public void selectPaymentMethod(PaymentMethod paymentMethod) {
		WebElement paymentMethodCheckboxElement = driver.findElements(By.cssSelector("input[type=\"radio\"]"))
				   .stream()
				   .filter(element -> element.getAttribute("value").equals(paymentMethod.getValue()))
				   .findFirst()
				   .orElse(null);

		if (paymentMethodCheckboxElement != null) {																						
			paymentMethodCheckboxElement.click();
			
			WebElement continueButtonElement = driver.findElement(By.id("tdb6"));
			continueButtonElement.click();
		}
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
