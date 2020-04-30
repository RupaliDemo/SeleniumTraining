package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectchoicevalue( driver,"Choice2");

}
	
	public static void selectchoicevalue(WebDriver driver, String value) {
		
		
     List<WebElement>  choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle "));
		
		for(int i = 0; i< choiceList.size();i++)
		{
			String  text = choiceList.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value));
			{
				choiceList.get(i).click();
				break;
			
			}
		}
	
	}
	}

