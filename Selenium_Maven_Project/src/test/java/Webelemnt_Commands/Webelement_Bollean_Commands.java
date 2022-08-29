package Webelemnt_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelement_Bollean_Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		
		//driver.findElement(By.xpath("(//span[contains(normalize-space(),'Jobseeker Login')])[3]")).click();
		//Thread.sleep(3000);
			
		
	boolean btn_exits=	driver.findElement(By.xpath("//button[@id='but1']")).isDisplayed();
	
	System.out.println("-----btn_exits----" +btn_exits);//True
		
	boolean btn_enable=	driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
	
	System.out.println("-----btn_enable----" +btn_enable);//false
	
	
	boolean btn_enable2=	driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
	
	System.out.println("-----btn_enable2----" +btn_enable2);//false
	
	
	
	
	boolean selected_info=	driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
	
	System.out.println("-----selected_info----" +selected_info);//false
	
	
	
	boolean selected_info_2=driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
	
	System.out.println("-----selected_info_2----" +selected_info_2);//false
	
	
	
	
		
		
		//driver.findElement(By.xpath("")).isSelected();
		
		//driver.close();
		
		
		
	}

}
