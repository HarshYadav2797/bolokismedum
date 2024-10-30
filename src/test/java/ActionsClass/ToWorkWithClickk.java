package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWithClickk {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement forgotpss = driver.findElement(By.linkText("Forgotten password"));
	Actions act= new Actions(driver);
	act.click(forgotpss).perform();
	}
}
