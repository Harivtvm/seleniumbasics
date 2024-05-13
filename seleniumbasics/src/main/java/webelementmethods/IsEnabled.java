package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		WebElement show=driver.findElement(By.xpath("//input[@id='disabledInput']"));
		boolean check1status=show.isEnabled();
		System.out.println(check1status);
		WebElement show1=driver.findElement(By.xpath("//input[@id='input']"));
		boolean check2status=show1.isEnabled();
		System.out.println(check2status);
	}

}
