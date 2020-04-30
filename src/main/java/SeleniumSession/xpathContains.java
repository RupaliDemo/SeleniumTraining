package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(5000);
		
		// Element Declaration 
		 WebElement selenium =driver.findElement(By.xpath("//*[contains(@href,'#')]"));
		 WebElement login = driver.findElement(By.xpath("//*[contains(@href,'../login.html')]"));
		 WebElement email = driver.findElement(By.id("email"));
		 WebElement passwd = driver.findElement(By.id("passwd"));
		 WebElement submit = driver.findElement(By.id("SubmitLogin"));
		 
		 
		 // click method
		 selenium.click();
		 login.click();
		 email.sendKeys("rupali083@gmail.com");
		 passwd.sendKeys("india@123");
		 submit.click();
		 
		 

	}

}
