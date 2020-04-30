package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String arg[])
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");

	}
}
