package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Down_Scroll_Up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)(driver);
		//Scroll Down 
	//	jse.executeScript("window.scrollBy(0,1000)");
		
		//Thread.sleep(2000);
		//Scroll Up
		
    //  jse.executeScript("window.scrollBy(0,-1000)");
		
	//	Thread.sleep(2000);
		
		// Bottom of the screen 
		
		//jse.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
//WebElement	wb=	driver.findElement(By.xpath("//a[@title='Facebook']"));
		
		
		//jse.executeScript("arguments[0].scrollIntoView()",wb);
		
		
		jse.executeScript("scroll(0,1500)");	//scroll down
		jse.executeScript("scroll(1500,0)");////scroll Up
		
		System.out.println("---");
		
		
		
		
		
	}

}
