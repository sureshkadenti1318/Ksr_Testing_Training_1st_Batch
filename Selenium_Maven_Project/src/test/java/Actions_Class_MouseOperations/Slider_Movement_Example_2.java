package Actions_Class_MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider_Movement_Example_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rangeslider.js.org/");

		driver.manage().window().maximize();

		// Create object for Actions Class

		Actions act = new Actions(driver);

		WebElement src = driver
				.findElement(By.xpath("//div[@id='js-rangeslider-0']//div[@class='rangeslider__handle']"));

		System.out.println(src.getLocation().getX());
		System.out.println(src.getLocation().getY());

		act.dragAndDropBy(src, -100, 0).perform();

		String OutPut_AfterSlide = driver.findElement(By.xpath("//output[@id='js-output']")).getText();
		System.out.println("---OutPut_AfterSlide---" + OutPut_AfterSlide);

		driver.close();

	}

}
