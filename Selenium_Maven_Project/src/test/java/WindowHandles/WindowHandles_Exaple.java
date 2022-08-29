package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_Exaple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		String parent_windowId=	driver.getWindowHandle();
		
		System.out.println("---parent_windowId--" +parent_windowId);
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		
		Thread.sleep(3000);
		
	Set<String> all_window_ids=	driver.getWindowHandles();
	
	int count=all_window_ids.size();
	
	System.out.println("---count--" +count);//2
	
Iterator<String>it=	all_window_ids.iterator();
	
String Parnt_wndw_id=it.next();

System.out.println("---Parnt_wndw_id---" +Parnt_wndw_id);

String Child_window_id=it.next();

System.out.println("---Child_window_id--" +Child_window_id);

//
driver.switchTo().window(Child_window_id);//

String childwindw_Tittle=driver.getTitle();

System.out.println("----childwindw_Tittle---" +childwindw_Tittle);

driver.switchTo().window(Parnt_wndw_id);

String prnt_Tittle=driver.getTitle();

System.out.println("----prnt_Tittle---" +prnt_Tittle);

//driver.close();







	
		
			
	}

}
