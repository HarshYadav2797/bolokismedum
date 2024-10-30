package BrowserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomDynamicElements {
	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/apple-iphone-15-blue-128-gb/p/itmbf14ef54f645d?pid=MOBGTAGPAQNVFZZY&lid=LSTMOBGTAGPAQNVFZZYO7HQ2L&marketplace=FLIPKART&q=iphone+15&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=AS_Query_PredictiveAutoSuggest_2_0_na_na_na&otracker1=AS_Query_PredictiveAutoSuggest_2_0_na_na_na&fm=search-autosuggest&iid=455e05fd-e2f6-4c32-957d-63983e2cdf86.MOBGTAGPAQNVFZZY.SEARCH&ppt=sp&ppn=sp&ssid=lc8g98ebg00000001706545215888&qH=2f54b45b321e3ae5");
    String gettext = driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])[6]//*//*//following-sibling::div//following-sibling::div//following-sibling::div//*//*//*[@class='_30jeq3 _16Jk6d']")).getText();
	System.out.println(gettext);
	
	
	
	}

}
