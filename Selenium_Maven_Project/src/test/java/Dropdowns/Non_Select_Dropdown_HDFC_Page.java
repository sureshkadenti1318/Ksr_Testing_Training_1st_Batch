package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Non_Select_Dropdown_HDFC_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
     
			
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");
		
		  //driver.findElement(By.xpath("//img[@class='closeSummer']")).click();
		  
		  driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]")).click();
		  
		  Thread.sleep(2000); List<WebElement> dropdownotns =
		  driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		  
		  int count = dropdownotns.size();
		  
		  for (int i = 0; i < count; i++) { String options_text =
		  dropdownotns.get(i).getText(); System.out.println("---options_text---" +
		  options_text);
		  
		  if(options_text.contains("FASTag")) {
			  dropdownotns.get(i).click();
			  break; 
			  }
		  
		  }
		 

	//	driver.close();
		
		
		
		
		
	}

}
