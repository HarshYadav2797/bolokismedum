package webdriver_Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToworkwithManageWindowSetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Dimension d= new Dimension(1200, 800);
		driver.manage().window().setSize(d);
	}

}
