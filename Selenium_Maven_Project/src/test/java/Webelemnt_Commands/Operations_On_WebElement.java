package Webelemnt_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operations_On_WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://sme.spicejet.com/Airline/SMERegister");
		
	//WebElement org_add=	driver.findElement(By.id("smeRegistration_OrganizationName"));
	
	//org_add.sendKeys("KSR1318");
	
	//WebElement org_add1=driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']"));
	
	//org_add1.sendKeys("ksr1318");
		
			
	
		//OrgName
	driver.findElement(By.xpath("//input[@id='smeRegistration_OrganizationName']")).sendKeys("Test123");
	
	WebElement first_name=driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']"));
	
	first_name.sendKeys("Gayathri");
	Thread.sleep(3000);
	
	//FirstName
	//driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("Gayathri");
	
	
	
	driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).clear();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).sendKeys("Radha");
	
	
	//driver.findElement(By.xpath("")).click();
	
String attributeInfo=driver.findElement(By.xpath("//input[@id='smeRegAuthorizedSignatoryDetail_FirstName']")).getAttribute("name");//smeRegAuthorizedSignatoryDetail.FirstName

System.out.println("-----attributeInfo-----" + attributeInfo);
	
String tgname=driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getTagName();
	
	System.out.println("---tgname---" +tgname);//h1
	
	
	String Text=driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getText();
	
	
	System.out.println("----Text---" +Text);
	
String color=	driver.findElement(By.xpath("//h1[contains(text(),'Registration Form')]")).getCssValue("color");
	
System.out.println("---color---" +color);//Rgba values
	
	
	driver.close();
	
	
	
	
	
		
	}

}
