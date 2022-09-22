package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotation_Order {

	WebDriver driver;

	@BeforeClass

	public void BeforeClass_Test() {

		System.out.println("-----------@BeforeClass------------");

	}

	@AfterClass

	public void AfterClass_Test() {

		System.out.println("----------@AfterClass------------");

	}

	@BeforeSuite

	public void BeforeSuite_Test() {

		System.out.println("-----------@BeforeSuite------------");

	}

	@AfterSuite

	public void AfterSuite_Test() {

		System.out.println("----------@AfterSuite-----------");

	}

	@BeforeTest

	public void BeforeTest_Test() {

		System.out.println("----------	@BeforeTest-----------");

	}

	@AfterTest

	public void AfterTest_Test() {

		System.out.println("---------@AfterTest---------");

	}

	@BeforeMethod

	public void BeforeMethod_Test() {

		System.out.println("----------	@BeforeMethod-----------");

	}

	@AfterMethod

	public void AfterMethod_Test() {

		System.out.println("---------@AfterMethod---------");

	}

	@Test(priority = 1)
	public void B_UrlTest() {
		
		System.out.println("----@Test(priority = 1)---");

	}

	@Test(priority = 2)
	public void A_lrtTest() throws InterruptedException {

		
		System.out.println("---@Test(priority = 2)--");
	}

	@Test(priority = 3)
	public void Test_Check() throws InterruptedException {
		
		System.out.println("---@Test(priority = 3)--");

	}

}
