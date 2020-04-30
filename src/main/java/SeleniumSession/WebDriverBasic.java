package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
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
		
			
			
	}

}
