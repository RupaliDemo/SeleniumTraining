package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAction {
	
	WebDriver driver;
	/**
	 * This Method is used to launch the browser on the basis of given browser
	 * @param browser
	 * @return 
	 */
	public WebDriver LaunchBrowser(String browser)
	{
		 switch (browser) {
		case "chrome":
			   WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			break;
		case "ie" :
			  WebDriverManager.iedriver().setup();
			  driver = new InternetExplorerDriver();
		default:
			
			System.out.println("Please pass correct browser ----->" +browser);
			break;
			
			
		}
		return driver;
		 
	}
	
	
	/**
	 This Method is used to launch the browser on basis of given Url
	 */
	public void LaunchUrl(String Url)
	{
		driver.get(Url);
	}
	/**
	 * This Mehod is used to get the title of given url
	 * @return
	 */
	public String DoGetTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * This method will maximize the window
	 */
	public void  MaximizeWin()
	{
		driver.manage().window().maximize();
	}
	/**
	 * This method will fullScreen the window
	 */
	public void FullScreen()
	{
		driver.manage().window().fullscreen();
	}
	/**
	 * This method used to quit the browser
	 */
	 public void QuitBrowser()
	 {
		 driver.quit();
	 }

}
