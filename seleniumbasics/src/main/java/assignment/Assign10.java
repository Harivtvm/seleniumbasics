package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		List<WebElement> boxlist = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(boxlist.size());
		for (WebElement element1 : boxlist) {
			System.out.println(element1.isDisplayed());
		}
		for (WebElement element2 : boxlist) {
			System.out.println(element2.isEnabled());
		}
		for (WebElement element3 : boxlist) {
			System.out.println(element3.getTagName());
		}
	}

}
