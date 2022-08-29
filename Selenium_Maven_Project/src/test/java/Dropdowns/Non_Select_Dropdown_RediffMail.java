package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Non_Select_Dropdown_RediffMail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?");

		 driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']")).click();
		 
		 Thread.sleep(2000);
	List<WebElement>dropdownotns= driver.findElements(By.xpath("//li[contains(@onclick,'javascript')]"));
	
	int count=dropdownotns.size();
	
	for(int i=0;i<count;i++)
	{
	String options_text=	dropdownotns.get(i).getText();//India (+91),-USA / Canada (+1)
	System.out.println("---options_text---" +options_text);
	
	if(options_text.contains("Uganda"))//Afghanistan (+93)---Afghanistan
	{
		dropdownotns.get(i).click();
		break;
	}
	
	}
	
		driver.close(); 
		

	}

}
