package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		
		  Thread.sleep(1000);
		  
		  Actions act = new Actions(driver);
		  
		  WebElement src=driver.findElement(By.xpath("(//img[@id='drag1'])[1]"));
		  WebElement dst=driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
		  
		  act.clickAndHold(src).moveToElement(dst).release().build().perform();
		  
		  
		//  act.dragAndDrop(src, dst).build().perform();
		  
		  System.out.println("--done--");
		 
	
	//driver.close();
		
		
		
	}

}
