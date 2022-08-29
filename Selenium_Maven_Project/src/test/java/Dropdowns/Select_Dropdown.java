package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://sme.spicejet.com/Airline/SMERegister");

		WebElement RegionDropdown = driver.findElement(By.xpath("//select[@id='smeRegistration_Region']"));

		Select slct = new Select(RegionDropdown);

		// slct.selectByIndex(3);//3

		// slct.selectByValue("4");//2--West

		slct.selectByVisibleText("West");// 1
		
		slct.selectByVisibleText("North");

		boolean flag = slct.isMultiple();
		
		System.out.println("---flag---" + flag);

		String x = slct.getFirstSelectedOption().getText();
		System.out.println("---x---" + x);

		List<WebElement> options = slct.getOptions();

		int count = options.size();// 5

		for (int i = 0; i < count; i++) {
			String txt_optn = options.get(i).getText();
			System.out.println("--txt_optn--" + txt_optn);
		}

	}

}
