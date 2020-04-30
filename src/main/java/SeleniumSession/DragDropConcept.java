package SeleniumSession;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		//System.out.println(source + "+" +destination);
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
	    action.dragAndDrop(source, target).build().perform();
	    action.clickAndHold().dragAndDrop(source, target).release().build().perform();
	    
		
		
		
	}

}
