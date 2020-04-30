package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForTitle {


	
	 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
//		 Implicit wait not work for title .Always applied for WebElement
	    
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		driver.get("https://www.hubspot.com/login");
		
		System.out.println(driver.getTitle());
		
		
	}

}
