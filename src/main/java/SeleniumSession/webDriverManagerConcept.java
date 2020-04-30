package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerConcept {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("Page title is : "+ title);
         driver.quit(); // org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
         //driver.close();org.openqa.selenium.NoSuchSessionException: invalid session id
		
         
         
         System.out.println(driver.getTitle());
		
		
		

	}

}
