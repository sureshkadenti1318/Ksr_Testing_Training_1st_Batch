package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Annotation_Uses {

	WebDriver driver;

	@BeforeClass

	public void openBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@AfterClass

	public void browserClose() {
		driver.close();
	}

	@Test(priority = 1)
	public void B_UrlTest() {

		// TODO Auto-generated method stub

		driver.get("https://www.google.co.in/");

		String url = driver.getCurrentUrl();// Curretly opened url

		System.out.println("---Url of the application--- " + url);

	}

	@Test(priority = 2)
	public void A_lrtTest() throws InterruptedException {

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();

		String alrtTxt = alt.getText();// to the text

		System.out.println("--alrtTxt---" + alrtTxt);

		alt.accept();

	}

	
	@Test(priority = 3)
	public void Test_Check() throws InterruptedException {
System.out.println("---Test-------");

	}
	
	
}
