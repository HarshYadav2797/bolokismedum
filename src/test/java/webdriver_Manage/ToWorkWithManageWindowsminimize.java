package webdriver_Manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindowsminimize {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().minimize();
		driver.quit();
	
}

}