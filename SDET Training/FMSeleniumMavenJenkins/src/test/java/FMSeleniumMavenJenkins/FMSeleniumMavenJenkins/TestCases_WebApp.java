package FMSeleniumMavenJenkins.FMSeleniumMavenJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases_WebApp {

	@Test
	public void tc_verifyTitle() {
		System.out.println("some code will go execute here");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com/");
		System.out.println("Page title is" + driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
		driver.findElement(By.id("pass")).sendKeys("Password!@#");
		driver.findElement(By.id("u_0_2")).click();

		String expectedvalue = "The email you’ve entered doesn’t match any account. Sign up for an account.";

		String actualvalue;
		actualvalue = "";

		actualvalue = driver
				.findElement(By.cssSelector(
						"#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();

		System.out.println("actual value is " + actualvalue);

		if (expectedvalue.equals(actualvalue)) {
			System.out.println("TEST PASSED");
		}

		else
			System.out.println("TEST FAILED");

	}
}
