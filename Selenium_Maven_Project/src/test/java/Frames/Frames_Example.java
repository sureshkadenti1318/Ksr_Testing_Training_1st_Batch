package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement frame_addrs=   driver.findElement(By.xpath("//frame[@name='login_page']"));
		
				
		//driver.switchTo().defaultContent();
		
		
		
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
		  driver.switchTo().frame(frame_addrs);
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		
		driver.close();
		
	}

}
