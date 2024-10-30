package PopUps;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions ch= new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.puma.in/");
		driver.manage().window().maximize();
		
		
		
		
		/*Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_ENTER);*/
		
	}

}
