package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_Frames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//WebElement frame_addrs=   driver.findElement(By.xpath("//frame[@name='login_page']"));
		

		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
				
		String info_1=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		
		System.out.println("---info--"+ info_1);
		
		driver.switchTo().parentFrame();//driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		
        String info_2=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		
		System.out.println("---info_2--"+ info_2);
		
				
		
		
		driver.close();
		
	}

}
