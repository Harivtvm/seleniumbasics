package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement attrib= driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
		System.out.println(attrib.getAttribute("id"));
		WebElement getvalue= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		System.out.println(getvalue.getAttribute("class"));
	}

}
