package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserAction {

	public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			driver.get("https://www.hubspot.com/login");
			Thread.sleep(5000);
			WebElement emailid = driver.findElement(By.id("username"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
//		Actions action = new Actions(driver);
//		action.sendKeys(emailid,"rupali083@gmail.com").build().perform();
//		action.sendKeys(password, "Strongsville@123");
//		action.click(loginButton).build().perform();
//		
		ElementUtil el = new ElementUtil( driver);
		el.doActionSendKey(By.id("username"), "rupali083@gmail.com");
        el.doActionSendKey(By.id("password"), "Strongsville@123");
        el.doActionClick(By.id("loginBtn"));
	}

}
