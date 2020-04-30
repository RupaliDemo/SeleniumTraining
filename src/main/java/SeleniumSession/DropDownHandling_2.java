package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "24-Mar-1982";
		
		SelectDropDownValue(month ,dob.split("-")[1]);
		SelectDropDownValue(day , dob.split("-")[0]);
		SelectDropDownValue(year , dob.split("-")[2]);
		
		
		
		
	}
	
	/**
	 * Generic Method to select drop down value without using select option like select By value , select by visible text,
	 * Select by index
	 */
	
	public static void  SelectDropDownValue( WebElement element , String value) {
		
		Select select = new Select(element);
		
		List<WebElement> monthlist = select.getOptions();
		
		for(int i =0;i< monthlist.size();i++)
		{
			
			 String  text = monthlist.get(i).getText();
			 if(text.equalsIgnoreCase( value))
			 {
				 monthlist.get(i).click();
				 break;
			 }
			 
		}
		
	}

}
