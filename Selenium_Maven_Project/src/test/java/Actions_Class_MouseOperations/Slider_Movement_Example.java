package Actions_Class_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_Movement_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/#colorpicker");

		driver.manage().window().maximize();
		
		WebElement frame_xpath = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame_xpath);
	

		// Create object for Actions Class

		Actions act = new Actions(driver);

		WebElement src = driver.findElement(By.xpath("//div[@id='green']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		act.dragAndDropBy(src, 100, 125).perform();

		//driver.close();

	}

}
