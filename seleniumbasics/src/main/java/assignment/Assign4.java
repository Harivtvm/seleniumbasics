package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement check = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		check.click();
		WebElement selectall = driver.findElement(By.id("button-two"));
		selectall.click();
	}

}
