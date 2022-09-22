package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_Using_Assertions {
	WebDriver driver;
	
	SoftAssert soft=new SoftAssert();

	@BeforeClass
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://sme.spicejet.com/Airline/SMERegister");

	}

	@Test(priority = 1)
	public void TittleValidation() {

		String tittle = driver.getTitle();
		System.out.println("---tittle---" + tittle);
		
		soft.assertEquals(tittle, "SpiceJet SME");
		

		String Ulr = driver.getCurrentUrl();
		System.out.println("---tittle---" + Ulr);
		
		soft.assertEquals(Ulr, "http://sme.spicejet.com/Airline/SMERegister");
		
		soft.assertAll();
		
		

	}
	
	
	@Test(priority = 2)
	
	public void boolenValidation()
	{
		
	driver.get("https://omayo.blogspot.com/");
		

	boolean btn_exits=	driver.findElement(By.xpath("//button[@id='but1']")).isDisplayed();
	
	System.out.println("-----btn_exits----" +btn_exits);//True
	
	soft.assertEquals(btn_exits, true);
		
	boolean btn_enable=	driver.findElement(By.xpath("//button[@id='but1']")).isEnabled();
	
	System.out.println("-----btn_enable----" +btn_enable);//false
	
	soft.assertEquals(btn_enable, true);
	
	
	boolean btn_enable2=	driver.findElement(By.xpath("//button[@id='but2']")).isEnabled();
	
	System.out.println("-----btn_enable2----" +btn_enable2);
	
	soft.assertEquals(btn_enable2, true);
	
	soft.assertAll();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@AfterClass
	public void closingBrower() {
		driver.close();
	}

}
