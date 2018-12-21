package POM_FMHerndonSMJ.com.fm.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmation {

	public String orderConfirmMessage(WebDriver driver) {
		System.out.println("Implement Capture order confir message functionality");
		String OrderConfirmationMessage = driver.findElement(By.cssSelector("h2")).getText();
		return OrderConfirmationMessage;
	}
}
