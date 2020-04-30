package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserAction br1 = new BrowserAction() ;

	     WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	    
	    //1.id 
	     //driver.get("https://www.facebook.com");
		 //WebElement email =driver.findElement(By.id("email"));
		// WebElement pass =driver.findElement(By.id("pass"));
		// WebElement loginbutton =driver.findElement(By.id("loginbutton"));
		
		// email.sendKeys("rupali083@gmail.com");
		// pass.sendKeys("india@123");
		 //loginbutton.click();
		// driver.findElement(By.id("userNavigationLabel")).click();
		
		// System.out.println(driver.getTitle());
	     
	     //2. name
	     
	  /**   driver.get("https://classic.crmpro.com/");
	     
	    WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("test@gmail.com");
	     
	     WebElement pass = driver.findElement(By.name("password"));
	    	pass.sendKeys("Test");**/
	    	
	   
	     //3.classname	
	     driver.get("https://app.hubspot.com/login");
	     Thread.sleep(5000);
	     
	     //form-control private-form__control login-email
	     //form-control private-form__control login-password m-bottom-3
	   //  driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
	   //  driver.findElement(By.className("login-password")).sendKeys("test");
	     
	
		 //4. xpath
		 
		// br1.QuitBrowser();
	   // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
	   // driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
	  //button[@id='loginBtn']
	 //   driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	    
	   //5. css selector
	  //  driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
	   // driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
	   // driver.findElement(By.cssSelector("#loginBtn")).click();
	    
	    //6.linkText
	     driver.findElement(By.linkText("Sign up")).click();
	    
	    //7. PartialLinkText
	    driver.findElement(By.partialLinkText("Sign")).click();
	    //8.TagName
	    
	   // driver.findElement(By.ByTagName("")).getText();
		
	}

}
