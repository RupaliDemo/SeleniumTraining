package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithByLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
		driver.get("https://www.facebook.com/");
		
		By month = By.id("month");
		By day  = By.id("day");
		By year = By.id("year");
		
		ArrayList<String> monthlist =getDropDownValues(driver, month) ;
		
		ArrayList<String>	daylist =getDropDownValues(driver, day) ;
		
		ArrayList<String> yearlist= getDropDownValues(driver, year) ;
		
		System.out.println("Total No. of month is-->"+monthlist.size());
		System.out.println(monthlist);
		
		System.out.println("Total No. of day is-->"+daylist.size());
		System.out.println(daylist);
		
		
		System.out.println("Total No. of year is-->"+yearlist.size());
		System.out.println(yearlist);
		

	}
	
	 public static ArrayList<String> getDropDownValues(WebDriver driver,By locator) 
	 { 
		 
		 ArrayList<String> ar = new ArrayList<String>();
		 ElementUtil el = new ElementUtil(driver);
		  Select select =new Select(el.getElement(locator)); 
		  List<WebElement>optionlist = select.getOptions();
		  System.out.println("Total value in month drop down is -->" +optionlist.size()); 
		  for(int i =0;i<optionlist.size();i++) 
		  {
			  //System.out.println(optionlist.get(i).getText());
			  ar.add(optionlist.get(i).getText());
			  
		  }
	         return ar;
	  } 

}
