package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	public static void main(String[] args)

	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://amazon.com");
		 List<WebElement>  linkList = driver.findElements(By.tagName("img"));
		 int totalimg = linkList.size();
		 System.out.println("Total image is on the page :" +totalimg);
			
		 for(int i = 0; i <totalimg; i++ )
			 
			 
		 {
			 if(!linkList.equals("null"))
			 {
			 System.out.println( i+ "--->" +linkList.get(i).getAttribute("src"));
			 }
		 }
	}

}
