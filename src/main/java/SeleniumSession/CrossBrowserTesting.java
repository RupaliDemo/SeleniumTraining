package SeleniumSession;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser ="chrome";
		WebDriver  driver = null;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver" , "C:\\Driver1\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equals("FireFox"))
			
			{
			   WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		
		else if(browser.equals("ie"))
			{
			     WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
		else 
		{
			System.out.println("Browser not found--" +browser);
		}
		
		
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
		
		String url =driver.getCurrentUrl();
		
		if(url.contains("Google"))
		{
			System.out.println("Correct Url");
		}
		
		else
		{
			System.out.println("Incorrect Url");
		}
		
		String title1 =driver.getTitle();
		System.out.println(title1);
	}
	

	
	
	
	

	}


