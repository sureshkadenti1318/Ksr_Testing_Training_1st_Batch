package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Concept {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

@Test(dataProvider = "testdata" )
public void loginValidation(String UN ,String pwd)
{
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		 
		 driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
		
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);

	
}
@AfterClass
public void browserClose()
{
	driver.close();
}



@DataProvider
public Object[][] testdata()
{

Object [] [] data = new Object[3][2];//3-row, 2-column

data[0][0]="UN1";
data[0][1]="Pwd1";

data[1][0]="UN2";
data[1][1]="Pwd2";

data[2][0]="UN3";
data[2][1]="Pwd3";

return data;

}





}
