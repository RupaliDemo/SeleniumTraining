package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks_Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String underConsTitle = "Under Construction: Mercury Tours";
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS );
		List<WebElement> linkElements =driver.findElements(By.tagName("a"));
		
		System.out.println(linkElements.size());
		
		String[] linkTexts = new String[linkElements.size()];
		
		int i = 0;
		
		//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
		linkTexts[i] = e.getText();							
		i++;			
    }	
		
		//test each link		
		
		for (String t : linkTexts) {							
		driver.findElement(By.linkText(t)).click();					
		if (driver.getTitle().equals(underConsTitle)) {							
            System.out.println("\"" + t + "\""								
                    + " is under construction.");			
        } else {			
            System.out.println("\"" + t + "\""								
                    + " is working.");			
        }		
		driver.navigate().back();			
    }		
		driver.quit();			

		
		
	}

}
