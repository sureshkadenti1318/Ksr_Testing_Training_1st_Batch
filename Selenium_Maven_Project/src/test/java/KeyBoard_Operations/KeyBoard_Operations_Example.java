package KeyBoard_Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Operations_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/advanced_search");
		
		driver.findElement(By.name("as_q")).sendKeys("test1234567");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"A");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"C");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"V");
		
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"V");
		driver.findElement(By.name("as_epq")).sendKeys(Keys.CONTROL+"V");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
