package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StealElementRefExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com/");
		 WebElement username = driver.findElement(By.name("username"));
		 username.sendKeys("naveen");
		 driver.navigate().refresh();
		  username = driver.findElement(By.name("username"));//5a908ab6-d7ff-457d-9d6c-32aece325f6c
		 
		 username.sendKeys("rupali");//5a908ab6-d7ff-457d-9d6c-32aece325f6c
		 
		 // SeleniumSession.StealElementRefExcep.main(StealElementRefExcep.java:21)
		 
		 
		 //[[ChromeDriver: chrome on WINDOWS (82ad13399d22dd11cb34b77c1e453075)-> name: username]
		 // Steal - Not freash
	}

}
