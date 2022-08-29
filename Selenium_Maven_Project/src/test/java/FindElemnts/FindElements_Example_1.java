package FindElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://sme.spicejet.com/Airline/SMERegister");

		// WebElement wb= driver.findElement(By.xpath("//input"));

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));// 79

		int count = alllinks.size();// 79
		System.out.println(count);

		for (int i = 0; i <= count; i++) {
			String link_txt = alllinks.get(i).getText();
			System.out.println("link_txt--" + link_txt);

			if (link_txt.contains("foods")) {
				alllinks.get(i).click();
				break;
			}
		}

		driver.close();

	}

}
