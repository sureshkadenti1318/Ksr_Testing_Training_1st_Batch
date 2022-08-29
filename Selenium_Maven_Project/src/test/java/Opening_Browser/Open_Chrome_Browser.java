package Opening_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Chrome_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Trainning_Batches_KSR\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
			
		
		WebDriver driver= new ChromeDriver();// Webdriver: Interface , ,ChromeDriver()---Class
		
		driver.manage().window().maximize();// To maximize browser window
		
		
			
		
	}

}
