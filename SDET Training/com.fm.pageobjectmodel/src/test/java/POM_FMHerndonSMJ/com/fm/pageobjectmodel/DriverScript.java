package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverScript {

	static WebDriver driver;
	String ItemToSearch = "Echo";

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		String AUT = "http://sdettraining.com/online/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AUT);
	}

	@Test
	public void tc_End2EndShoppingCart() {

		System.out.println("Step 1: Search class/page object will get called");
		Search sp = new Search();
		sp.searchItem(driver, ItemToSearch);
		System.out.println("Step 2: AddToCart class/page object will get called");
		AddToCart ac = new AddToCart();
		ac.AddItemToCart(driver);
		System.out.println("Step 3: ModifyCart class/page object will get called");
		ModifyCart mc = new ModifyCart();
		mc.ModifyItemCart(driver);
		System.out.println("Step 4: CheckOut class/page object will get called");
		CheckOut co = new CheckOut();
		co.CheckoutCart(driver);
		System.out.println("Step 5: OrderConfirmation class/page object will get called");
		OrderConfirmation oc = new OrderConfirmation();
		String Ordernumber;
		Ordernumber = oc.orderConfirmMessage(driver);
		System.out.println("Step 5: Verify that order has been placed code will get executed");
		System.out.println("Order has been placed successfully and order number is :" + Ordernumber);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Browser will get closed");
		driver.close();

	}
}
