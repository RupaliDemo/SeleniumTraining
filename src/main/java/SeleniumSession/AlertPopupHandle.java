package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		
		String text =alert.getText();
		
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Corect error message");
		} else {
			System.out.println("incorrect error message");
		  }
		
		alert.accept();
	/**	alert.dismiss();
		alert.getText();
		alert.sendKeys(keysToSend);**/
		
		

	}

}