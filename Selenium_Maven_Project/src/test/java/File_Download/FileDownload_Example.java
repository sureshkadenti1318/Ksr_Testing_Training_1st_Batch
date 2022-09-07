package File_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/download");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[normalize-space()='logo.jpg']")).click();
	
	Thread.sleep(3000);
	
	System.out.println("----Download--done---");
	
	driver.close();
	
	
	}

}
