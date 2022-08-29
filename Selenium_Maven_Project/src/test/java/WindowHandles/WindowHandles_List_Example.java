package WindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_List_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		
		Thread.sleep(3000);
		
					
	Set<String> all_window_ids=	driver.getWindowHandles();//  2
	
		
	ArrayList<String> ll=new ArrayList<String>(all_window_ids);
	
int count=	ll.size();//2
	
	
	for(int i=0;i<count;i++)
	{
		driver.switchTo().window(ll.get(i));
		
	String tittle=driver.getTitle();
	System.out.println("---tittle---" +tittle);
		
	}
	
	
	
//	
//Iterator<String>it=	all_window_ids.iterator();
//	
//String Parnt_wndw_id=it.next();
//
//System.out.println("---Parnt_wndw_id---" +Parnt_wndw_id);
//
//String Child_window_id=it.next();
//
//System.out.println("---Child_window_id--" +Child_window_id);
//
////
//driver.switchTo().window(Child_window_id);//
//
//String childwindw_Tittle=driver.getTitle();
//
//System.out.println("----childwindw_Tittle---" +childwindw_Tittle);
//
//driver.switchTo().window(Parnt_wndw_id);
//
//String prnt_Tittle=driver.getTitle();
//
//System.out.println("----prnt_Tittle---" +prnt_Tittle);

//driver.close();







	
		
			
	}

}
