package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		driver.get("https://www.hubspot.com/login");
		/**
		 *  Thread .sleep()->Static wait wait for given period of time.
		 *  ImplictWait : applied for all the webElement by default
		 *  ImplictWait : Dynamic Wait
		 *  ImplictWait : Global Wait , immediately  created after driver launch
		 */
		//Thread.sleep(5000);
		
		
		
		WebElement emailid = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		emailid.sendKeys("rupali083@gmail.com");
		password.sendKeys("Strongsville@123");;
		loginButton.click();
		
		
		
		
	}

}
