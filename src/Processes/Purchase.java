package Processes;

import org.openqa.selenium.WebDriver;

import Screens.DeliveryInformation;
import Screens.Login;
import Screens.OrderConfirmation;
import Screens.PaymentInformation;
import Screens.ProductSelection;
import Screens.ProductInformation;
import Screens.ShoppingCart;
import model.PaymentMethod;
import model.Product;
import model.ShippingMethod;

public class Purchase {
	
	private WebDriver driver;
	
	public void startProcess(Product product) {
		driver.get("https://demo.oscommerce.com/index.php");
		
		selectProduct(product);
		addToCart();
		checkout(product);
		login();
		selectShippingMethod(ShippingMethod.PER_ITEM);
		selectPaymentMethod(PaymentMethod.CASH_ON_DEVELIVERY);
		pay();
	}
	
	private void selectProduct(Product product) {
		ProductSelection productSelection = new ProductSelection();
		productSelection.setDriver(driver);
		productSelection.selectProduct(product);
	}
	
	private void addToCart() {
		ProductInformation productInformation = new ProductInformation();
		productInformation.setDriver(driver);
		productInformation.addProductToCart();
	}
	
	private void checkout(Product product) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setDriver(driver);
		shoppingCart.checkout(product);
	}
	
	private void login() {
		Login login = new Login("test.aut@test.com", "123456");
		login.setDriver(driver);
		login.authentication();
	}
	
	private void selectShippingMethod(ShippingMethod shippingMethod) {
		DeliveryInformation deliveryInformation = new DeliveryInformation();
		deliveryInformation.setDriver(driver);
		deliveryInformation.selectShippingMethod(shippingMethod);
	}
	
	private void selectPaymentMethod(PaymentMethod paymentMethod) {
		PaymentInformation paymentInformation = new PaymentInformation();
		paymentInformation.setDriver(driver);
		paymentInformation.selectPaymentMethod(paymentMethod);
	}
	
	private void pay() {
		OrderConfirmation orderConfirmation = new OrderConfirmation();
		orderConfirmation.setDriver(driver);
		orderConfirmation.pay();
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
