package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Testing {
	WebDriver driver;
	
	@Test()
	@Parameters("browser")
	public void CrossBrowser_Testing(String browsername) throws InterruptedException
	
 {
		if(browsername.equalsIgnoreCase("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		}

		if(browsername.equalsIgnoreCase("Edge"))
		{
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 
		}
		 
		
		

		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 
		 driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Test");
		
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password");

		driver.close();
	}

	
	
	
	
}
