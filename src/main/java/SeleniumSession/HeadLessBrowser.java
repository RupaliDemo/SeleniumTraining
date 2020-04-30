package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
	    WebDriver  driver = new ChromeDriver(co);
	    
	    driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("Page title is : "+ title);
		if(title.equals("Google"))
				{
			     System.out.println("Correct Title");
				}
		else
		{
			System.out.println("Incorrect Title");
		}
		
	}

	
}
