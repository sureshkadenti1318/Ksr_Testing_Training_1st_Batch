package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Horizantal_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.album.alexflueras.ro/");

		JavascriptExecutor jse = (JavascriptExecutor) (driver);

		//// Scroll to Right

		WebElement ScroolRight = driver.findElement(By.id("a22"));

		jse.executeScript("arguments[0].scrollIntoView()", ScroolRight);
		
		Thread.sleep(2000);

		//// Scroll to Left

		WebElement ScroolLeft = driver.findElement(By.id("a1"));

		jse.executeScript("arguments[0].scrollIntoView()", ScroolLeft);

		System.out.println("--done-");

	}

}
