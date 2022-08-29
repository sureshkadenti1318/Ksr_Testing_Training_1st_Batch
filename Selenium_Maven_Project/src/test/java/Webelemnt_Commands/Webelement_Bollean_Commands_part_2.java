package Webelemnt_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_Bollean_Commands_part_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.monsterindia.com/");
		
		
	driver.findElement(By.  xpath("(//span[contains(normalize-space(),'Jobseeker Login')])[3]")).click();
		  Thread.sleep(3000);
		  
		  boolean btn_enable=	driver.findElement(By.id("signInbtn")).isEnabled();
			
			System.out.println("-----btn_enable----" +btn_enable);//false
		 
		
/*
		
	boolean btn_enable=	driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
	
	System.out.println("-----btn_enable----" +btn_enable);//false
	
	
	driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	
	Thread.sleep(3000);
	
	boolean btn_enable2=	driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
	
	System.out.println("-----btn_enable2----" +btn_enable2);//false
	
	*/
	
	
	
		
		
		//driver.findElement(By.xpath("")).isSelected();
		
		//driver.close();
		
		
		
	}

}
