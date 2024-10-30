package webdriver_Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindowsGetSize {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println("size : " +size);
	    int height = driver.manage().window().getSize().getHeight();
	    System.out.println(height);
	    int width = driver.manage().window().getSize().getWidth();
	    System.out.println(width);
	
}

}
