package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowwithList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
	
		 driver.findElement(By.linkText("Good PopUp #3" )).click();
		 Set<String> handles = driver.getWindowHandles();
		 List<String> handlelist = new ArrayList<String>(handles);
		String ParentWindowId = handlelist.get(0);
		String ChildWindowId = handlelist.get(1);
		System.out.println("Parent Id is:" +ParentWindowId);
		System.out.println("ChildWindow ID is" +ChildWindowId);
		
	}

}
