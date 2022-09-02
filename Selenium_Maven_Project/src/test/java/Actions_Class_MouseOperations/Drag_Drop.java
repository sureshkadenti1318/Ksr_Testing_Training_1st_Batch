package Actions_Class_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");

		driver.manage().window().maximize();

	WebElement	frame_xpath=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(frame_xpath);
		
		
		// Create object for Actions Class

		Actions act = new Actions(driver);
	
		WebElement src = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement dst = driver.findElement(By.xpath("//div[@id='trash']"));

		//act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		
		// Drag&Drop
		act.dragAndDrop(src, dst).perform();

		driver.close();

	}

}
