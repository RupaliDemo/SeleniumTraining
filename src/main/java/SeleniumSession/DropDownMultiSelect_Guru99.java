package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiSelect_Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver" , "C:\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//By fruits = By.id("//select[@id ='fruits']");
        driver.get( "http://jsbin.com/osebed/2");
        
        Select fruits_select = new Select(driver.findElement(By.id("fruits")));
       
        
        fruits_select.selectByVisibleText("Banana");
        fruits_select.selectByIndex(2);
	}

}
