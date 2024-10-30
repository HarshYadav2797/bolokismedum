package BrowserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver driver= new ChromeDriver();
	  Thread.sleep(2000);
	  driver.get("https://www.shoppersstack.com/products_page/17");
	  /*driver.findElement(By.xpath("//a[text()='Women']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[text()='FOREVER 21  Casual Regular Sleeves ...']")).click();
	  Thread.sleep(2000);*/
	  driver.findElement(By.id("compare")).click();
	  driver.close();  
	  driver.quit();
	}

}
