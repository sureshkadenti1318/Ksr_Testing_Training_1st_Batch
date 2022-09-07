package File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://sme.spicejet.com/Airline/SMERegister");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='smeRegistration_PANFile']")).sendKeys("D:\\Trainings\\Automation Assignments.pdf");
	
	Thread.sleep(3000);
	
	System.out.println("----Upload--done---");
	
	//driver.close();
	
	
	}

}
