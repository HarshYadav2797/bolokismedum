package practice_javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
		
    WebDriver driver= new ChromeDriver();
  //driver.navigate().to("https://afterdoor.com/");
  //  driver.manage().window().maximize();
    //String text = driver.findElement(By.xpath("(//div[@class='col-xl-4 col-lg-4 col-md-4'])[2]//*//*//*//*//*//following-sibling::li")).getText();
    //System.out.println(text);
    
	//driver.get("https://www.flipkart.com/bata-men-slippers/p/itm7b742bcecabb6?pid=SFFG4NZT3HSRQQHZ&lid=LSTSFFG4NZT3HSRQQHZNTPBYL&marketplace=FLIPKART&q=bata+slippers&store=osp&srno=s_1_5&otracker=search&otracker1=search&fm=Search&iid=91657730-98f5-46ca-8305-ec14191a3e50.SFFG4NZT3HSRQQHZ.SEARCH&ppt=sp&ppn=sp&ssid=w3tzqigci80000001706708680555&qH=b3c897b0eb88a3a5");
	//String text = driver.findElement(By.xpath("//div[@class='aMaAEs']//*//following-sibling::div//following-sibling::div//*//*//*[@class='_30jeq3 _16Jk6d']")).getText();
	//System.out.println(text); */
	
     
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    String txt = driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])[6]//*//*//following-sibling::div//following-sibling::div//following-sibling::div//*//*//*")).getText();
	System.out.println(txt);
	}

}
