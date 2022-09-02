package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		Thread.sleep(3000);
	
		WebElement Frame_webelmnt=	driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(Frame_webelmnt);
		
WebElement Web_Src=	driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
WebElement Web_dst=	driver.findElement(By.xpath("//div[@id='trash']"));

Actions act = new Actions(driver);

act.dragAndDrop(Web_Src, Web_dst).build().perform();

Thread.sleep(3000);
System.out.println("-------done----");
		
		
		//driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
		/*
		 * Thread.sleep(1000);
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * WebElement src=driver.findElement(By.xpath("(//img[@id='drag1'])[1]"));
		 * WebElement dst=driver.findElement(By.xpath("(//div[@id='div2'])[1]"));
		 * 
		 * act.dragAndDrop(src, dst).build().perform();
		 * 
		 * System.out.println("--done--");
		 */
	
	//driver.close();
		
		
		
		
	}

}
