package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Format: http://username:password@URL)
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
			
		
	
	driver.close();
		
		
		
		
	}

}
