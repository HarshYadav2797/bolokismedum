package BrowserLaunching;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithManageWindow_Max {
	public static void main(String[] args) {
		
		//step 1 :launching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstop.com/");
		/*String pageSource = driver.getPageSource();
		System.out.println(pageSource);*/
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);
		String crtUrl = driver.getCurrentUrl();
		System.out.println(crtUrl);
		
	}

}
