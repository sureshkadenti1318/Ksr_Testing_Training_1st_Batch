package FindElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Example_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://www.google.co.in/");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		Thread.sleep(3000);

		
		  // WebElement wb= driver.findElement(By.xpath("//input"));
		  
		  List<WebElement> allsugstns = driver.findElements(By.xpath("//li[@class='sbct']"));//11
		  
		  int count = allsugstns.size();// 79 System.out.println(count);
		  
		  System.out.println("---count--" +count);
		  
			
			  for (int i = 0; i <= count; i++) { 
				  String link_txt =  allsugstns.get(i).getText();
				  
				  System.out.println("link_txt--" + link_txt);
			  
			  if (link_txt.contains("ide")) 
			  {
				  allsugstns.get(i).click(); 
				  break; 
				  } 
			  }
			  
			  
			  driver.close();
			 
		 
	}

}
