package BrowserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchURL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstop.com/");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

}
