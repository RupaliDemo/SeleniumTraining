package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
//    	String day_xpath = "//select[@id ='day']/option";
//		String month_xpath = "//select[@id ='month']/option";
//     	String year_xpath = "//select[@id ='year']/option";
		
		
		String month_css = "select#month option";
		String 	day_css  = "select#day option";
		String year_css=  "select#year option";
	   
		
   
		
		String dob = "jan-24-2020";
		doDropDownSelectWithoutselectclass(driver,"css" ,month_css, dob.split("-")[0]);
		
		doDropDownSelectWithoutselectclass(driver,"css", day_css, dob.split("-")[1]);
		
		doDropDownSelectWithoutselectclass(driver,"css", year_css, dob.split("-")[2]);
		
	}
	
	/**
	 *  Method to select drop down option without select class using xpath Z& CSS selector
	 */
 
	public static void doDropDownSelectWithoutselectclass(WebDriver driver, String locator, String locatorvalue , String Value) {
		
		List<WebElement> valuelist= null;
		if(locator.equalsIgnoreCase("xpath"))
		{
          valuelist =driver.findElements(By.xpath(locatorvalue));
          
        }else 
        	if(locator.equalsIgnoreCase("css"))
        {
        	valuelist =driver.findElements(By.cssSelector(locatorvalue));
        }
		
		System.out.println(valuelist.size());	
		
		for(int i =0;i< valuelist.size();i++)
		{
			 
			 String  text = valuelist.get(i).getText();
			 if(text.equalsIgnoreCase( Value))
			 {
				 valuelist.get(i).click();
				 break;
			 }
			 
		}
	}
}
