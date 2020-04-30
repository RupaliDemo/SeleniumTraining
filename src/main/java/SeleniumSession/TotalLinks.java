package SeleniumSession;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://amazon.in");
		 List<WebElement>  linkList = driver.findElements(By.tagName("a"));
		int totallinks = linkList.size();
		System.out.println("Total links is on the page :" +totallinks);
		
		// to print all the text of the link
		
		for(int i = 0; i <totallinks; i++ )
		
		{
			String linkText = linkList.get(i).getText();
			
			if(!linkText.isEmpty())
			{
			System.out.println(i +"--->" +linkText);
			
			System.out.println(linkList.get(i).getAttribute("href"));
			}
		}
		
		 
		   
	}

}
