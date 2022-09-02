package Actions_Class_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		//Create object for Actions Class
		
		Actions act=new Actions(driver);
		
WebElement	Right_Click_Me_xpath=	driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Right Click
		act.contextClick(Right_Click_Me_xpath).perform();
		
		act.doubleClick(Right_Click_Me_xpath).perform();
			
		driver.close();
		
		
	}

}
