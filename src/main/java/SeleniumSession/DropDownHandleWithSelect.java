package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {
		
	    	WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement month = driver.findElement(By.id("month"));
			WebElement day = driver.findElement(By.id("day"));
			WebElement year = driver.findElement(By.id("year"));
			
			Select select = new Select(month);
			select.selectByVisibleText("Mar");
			select.selectByIndex(6);
			select.selectByValue("3");
			Select select1 = new Select(day);
			
			//getDropDownValues(month);
			//getDropDownValues(day);
			//getDropDownValues(year);
			
			
			//select1.selectByVisibleText("24");
			//Select select2 = new Select(year);
			//select2.selectByVisibleText("1982");
			//ElementUtil el = new ElementUtil(driver);
			//el.getDropDownValues(year);
			//el.getDropDownValues(day);
			//el.getDropDownValues(month);
			
			//SelectDropDown(month , "Mar");
			//SelectDropDown(day , "24");
		//	SelectDropDown(year , "1982");
	}
	
	
	
	  public static void getDropDownValues(WebElement element) { 
		  Select select =new Select(element); 
		  List<WebElement>optionlist = select.getOptions();
	  System.out.println("Total value in month drop down is -->"
	  +optionlist.size()); 
	  for(int i =0;i<optionlist.size();i++) {
	  System.out.println(optionlist.get(i).getText()); }
	  
	  } 
	  
	  public static void SelectDropDown(WebElement element , String value) 
	  {
	  
	  Select select = new Select(element);
	  select.selectByVisibleText(value); 
	  }
	  
	  public static void SelectDropDown(WebElement element , int index) {
	  
	  Select select = new Select(element); select.selectByIndex(index); }
	  
	  public static void SelectDropDownValue(WebElement element , String index) {
	  
	  Select select = new Select(element); select.selectByValue(index); }
	 
}
