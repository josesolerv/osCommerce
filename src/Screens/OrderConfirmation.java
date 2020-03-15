package Screens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmation {
	private WebDriver driver;
	
	public void pay() {
		WebElement payNowButtonElement = driver.findElement(By.id("tdb5"));
		payNowButtonElement.click();
		
		WebElement orderSuccessfullyProcessedTitle = driver.findElement(By.cssSelector("h1"));
		
		assertEquals("Your Order Has Been Processed!", orderSuccessfullyProcessedTitle.getText());
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
