package Navigation_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Commands_Examples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		 driver.get("https://www.facebook.com/");
		
		 driver.navigate().back();//google
		
		 Thread.sleep(3000);
		 
		 driver.navigate().forward();//Facebook
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 
		 driver.close();
		
		
	}

}
