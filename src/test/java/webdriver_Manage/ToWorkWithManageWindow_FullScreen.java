package webdriver_Manage;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithManageWindow_FullScreen {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	/*WebElement utkarsh = driver.findElement(By.xpath("//input[@id='search']"));
	utkarsh.sendKeys("supermoney movie");
	utkarsh.submit();*/
	Dimension dim = new Dimension();
	Dimension size = dim.getSize();
	System.out.println(size);
	
	
}
}
