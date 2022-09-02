package Actions_Class_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		//Create object for Actions Class
		
		Actions act=new Actions(driver);
		
		//MouseOver
		
		WebElement men_tab=driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		act.moveToElement(men_tab).perform();
		
			
		driver.close();
		
		
	}

}
