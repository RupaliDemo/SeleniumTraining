package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.popuptest.com/goodpopups.html");
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Good PopUp #3" )).click();
		String handle = driver.getWindowHandle();
		 Set<String> handles = driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		 String ParentWindowId =it.next();//CDwindow-E2CB2DBE76E3E5464B5F0C3404E7C562
		 String ChildWindowId = it.next();
		 System.out.println("Parent Winndow id is:"+ParentWindowId );
		 System.out.println("Child Window id is: " +ChildWindowId);
		 
		/**
		 *  Parent Window CDwindow-AAD9ECFABCD83C92B00342DD83CE78EC:
		 *   ChildWindow CDwindow-3E56B050046EB37365940F9ADB61688D
		 */
		driver.switchTo().window(ChildWindowId);
		String title =driver.getTitle();
		System.out.println(title);
        driver.close();
        
        driver.switchTo().window(ParentWindowId);
		 
        String ParentWindowtitle =driver.getTitle();
		System.out.println("Parent window title is :" +ParentWindowtitle);
		
		
	}

}
