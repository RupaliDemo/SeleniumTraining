package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hubspot.com/login");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		/*s
		 * wait.until(ExpectedConditions.titleContains("Login"));
		 * System.out.println(driver.getTitle());
		 */
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));

		
		WebElement emailid = driver.findElement(By.id("username"));
		emailid.sendKeys("rupali083@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Strongsville@123");
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		loginButton.click();

	}

}
