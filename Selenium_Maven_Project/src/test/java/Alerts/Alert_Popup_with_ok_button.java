package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup_with_ok_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);
		
		
	Alert alt=	driver.switchTo().alert();
		
	String alrtTxt=alt.getText();//to the text
	
	System.out.println("--alrtTxt---" +alrtTxt);
		
	alt.accept();// clicks on ok button
	//alt.dismiss();// clicks on "cancel button
	
	//alt.sendKeys("");
	
	driver.close();
		
		
		
		
	}

}
