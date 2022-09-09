package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_Shot_Example {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		
	 driver= new ChromeDriver();
		driver.get("http://sme.spicejet.com/Airline/SMERegister");
		
		driver.manage().window().maximize();
		
		screenshtmthd("D:\\SpiceJt.png");
		Thread.sleep(2000);
	
		driver.get("https://www.google.com/");
		
		
		
		screenshtmthd("D:\\google.Jpeg");
		
	
	
	
	driver.close();
	
	
	}

	
	public static  void screenshtmthd(String filename) throws IOException
	{

		TakesScreenshot scrnsht =(TakesScreenshot)(driver);
		
		File src=scrnsht.getScreenshotAs(OutputType.FILE);
		
		File dst= new File (filename);
		
		FileUtils.copyFile(src, dst);
		
		System.out.println("-----Done---");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
