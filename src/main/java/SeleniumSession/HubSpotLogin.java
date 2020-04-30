package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLogin {

	public static void main(String[] args) {
		
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	  By emailid = By.id("username");
	  By password = By.id("password");
	  By Login = By.id("loginBtn");
	  By signup = By.linkText("Sign Up");
	  
	driver.get("https://www.hubspot.com/login");
	ElementUtil el = new ElementUtil(driver);
	el.ClickWhenReady(signup, 6);
		/*
		 * String title =el.WaitForTitleTobePresence("Login", 15);
		 * System.out.println(title);
		 */
		
		
		/*
		 * ElementUtil el = new ElementUtil(driver);
		 * el.WaitForElementTobePresence(emailid, 15).sendKeys("rupali083@gmail.com");
		 * el.doSendKey(password, "Strongsville@123"); el.doClick(Login);
		 * 
		 * 
		 */
}
}
