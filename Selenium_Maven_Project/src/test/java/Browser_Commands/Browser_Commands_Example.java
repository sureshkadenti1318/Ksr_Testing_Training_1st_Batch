package Browser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Commands_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		String url = driver.getCurrentUrl();// Curretly opened url

		System.out.println("---Url of the application--- " + url);

		String tittle = driver.getTitle();// Title of the page
		System.out.println("---tittle--of the page ---= " + tittle);//

//String page_source=driver.getPageSource();
//System.out.println("----page_source-----" +page_source);

	 driver.close();// it will close only one browser window ,currently focused window
		
		// driver.quit(); // It will close all the windows which opened by selenium code

	}

}
