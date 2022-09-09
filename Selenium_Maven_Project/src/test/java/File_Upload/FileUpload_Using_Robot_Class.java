package File_Upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Using_Robot_Class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	
	driver.manage().window().maximize();
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//div[@id='drag-drop-upload']")).click();
	
	Thread.sleep(3000);
	
	// Create Object for Robot Class
	
	Robot rb = new Robot();
	
	//Copying file to clipboard
	
	StringSelection str= new StringSelection("D:\\Trainings\\Websites for automation practice.docx");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	//Press control + V for pasting
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	
	// Pressiong Enter
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	System.out.println("----Upload--done---");
	
	driver.close();
	
	
	}

}
