package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement wb= driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		Select slct=new Select(wb);
		
	boolean mutlti_selct_dropdown=	slct.isMultiple();
	
	System.out.println("----mutlti_selct_dropdown---" +mutlti_selct_dropdown);
		
	slct.selectByVisibleText("Texas");
	
	Thread.sleep(2000);
		
	slct.selectByVisibleText("Washington");	
	
	Thread.sleep(2000);
	
	slct.selectByIndex(0);//calfrn
	
	Thread.sleep(2000);
	//slct.deselectByVisibleText("Texas");
	
	List<WebElement>optnisinfo= slct.getOptions();//8 webelemnts 
	
	int count=optnisinfo.size();
	
	System.out.println("---count--" + count);
	
	for(int i=0;i<count;i++)
	{
	String txt=	optnisinfo.get(i).getText();
	System.out.println("---txt--" +txt);
	}
	
	String first=slct.getFirstSelectedOption().getText();
	
	
	System.out.println("---first--"+first);
	
	
	
	driver.close();
		
		
		
	}

}
