package BrowserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchSourceCode {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
	    String SourceCode = driver.getPageSource();
	    System.out.println(SourceCode);
	    driver.quit();
	}

}
