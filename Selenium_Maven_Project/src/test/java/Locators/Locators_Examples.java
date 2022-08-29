package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.findElement(By.xpath("(//a[contains(text(),'Donate')])[2]")).click();

		
		  
		  //User Email WebElement UserEmail_input_field=
		  driver.findElement(By.id("userId"));
		  
		  WebElement UserEmail_input_field_1=driver.findElement(By.name("email"));
		  
		  WebElement UserEmail_input_field_2=driver.findElement(By.
		  className("selectors-input jsSelector"));
		  
		  WebElement UserEmail_input_field_3=driver.findElement(By.tagName("input"));
		  
		  
		  WebElement link_elemnt=driver.findElement(By.linkText("Testers Food"));
		  
		  WebElement link_elemnt_1=driver.findElement(By.partialLinkText("Testers"));
		  
		  WebElement xpath= driver.findElement(By.xpath("//input[@title='Password']"));
		  
		  
		  
		  
		  
		 

	}

}
