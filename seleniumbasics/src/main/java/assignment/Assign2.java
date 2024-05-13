package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php/");
		driver.manage().window().maximize();
//WebElement message=driver.findElement(By.id("single-input-field"));
//message.click();
//message.sendKeys("Hello");
		WebElement mess = driver.findElement(By.className("form-control"));
		mess.click();
		mess.sendKeys("Hello");

	}

}
