package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement like= driver.findElement(By.xpath("//a[contains(text(),'  Like us On Facebook ')]"));
		System.out.println(like.getAttribute("title"));
		System.out.println(like.getCssValue("background-color"));
		WebElement follow= driver.findElement(By.xpath("//a[contains(text(),'Follow All')]"));
		System.out.println(follow.getAttribute("title"));
		System.out.println(follow.getCssValue("background-color"));

	}

}
