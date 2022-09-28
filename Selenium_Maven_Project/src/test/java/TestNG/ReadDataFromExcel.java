package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void loginValidation() throws IOException {

		driver.get("https://selectorshub.com/xpath-practice-page/");

		FileInputStream f = new FileInputStream(
				"D:\\Trainings\\Trainning_Batches_KSR\\Jun_26_2022_Batch\\Java_Selenium_Workspace\\Git\\Ksr_Testing_Training_1st_Batch\\Selenium_Maven_Project\\TestData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(f);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		String username = sheet.getRow(2).getCell(0).getStringCellValue();
		
		String Pwd = sheet.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println("Username=========" +username);//Us2
		

		System.out.println("Pwd=========" +Pwd);//pwd2

		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Pwd);

	}

	@AfterClass
	public void browserClose() {
		driver.close();
	}

}
