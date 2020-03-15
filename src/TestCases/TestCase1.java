package TestCases;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Processes.Purchase;
import model.Product;



class TestCase1 {
	
	private static WebDriver driver;
	private static ChromeDriverService service;
	
	private Process process; 
	
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
		      .usingDriverExecutable(new File("chromedriver.exe"))
		      .usingAnyFreePort()
		      .build();
		  service.start();
	}
	
	public static void createDriver() {
		  driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());	  
	}
	
	public static void quitDriver() {
		  driver.quit();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		createAndStartService();	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

	@BeforeEach
	void setUp() throws Exception {
		createDriver();
		driver.manage().window().maximize();
	}

	@AfterEach
	void tearDown() throws Exception {
		quitDriver();
	}

	@Test
	void test1() {
		Product product1 = new Product("Samsung Galaxy Tab", 2);
		
		Purchase purchase1 = new Purchase();
		purchase1.setDriver(driver);
		
		purchase1.startProcess(product1);
	}
	
	@Test
	void test2() {
		Product product2 = new Product("Beloved", 3);
		
		Purchase purchase2 = new Purchase();
		purchase2.setDriver(driver);
		
		purchase2.startProcess(product2);
	}

}



