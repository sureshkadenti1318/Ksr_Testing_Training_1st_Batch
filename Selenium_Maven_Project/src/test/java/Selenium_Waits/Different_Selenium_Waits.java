package Selenium_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Different_Selenium_Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.xpath("//inupt")).click();
		
		Thread.sleep(10);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		
				
			
		
		WebElement wb1=  driver.findElement(By.xpath(""));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(wb1));
		
				
		
		
		driver.findElement(By.xpath("")).click();
		
	}

}
