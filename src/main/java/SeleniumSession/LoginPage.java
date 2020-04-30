package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 //locators -- page object
	
	static By emailid = By.id("username");
	static By password = By.id("password");
	static By loginButton = By.id("loginBtn");
	static By signUpLink = By.linkText("Sign up");
	
	public static void main(String args[]) throws InterruptedException
	{
		BrowserAction br = new BrowserAction();
		
		WebDriver driver =br.LaunchBrowser("chrome");
		
		br.LaunchUrl("https://www.hubspot.com/login");
	
		//Thread.sleep(5000);
		ElementUtil elementutil  = new ElementUtil(driver);
			
		//elementutil.getElement(emailid).sendKeys("test@gmail.com");
		//elementutil.getElement(password).sendKeys("test@123");
		//elementutil.getElement(signUpLink).click();
		
		elementutil.doSendKey(emailid, "rupali083@gmail.com");
		elementutil.doSendKey(password, "Strongsville@123");
		elementutil.doClick(loginButton);
		
		//elementutil.doSendKey(signUpLink,"Sign up");
	}
	
}
