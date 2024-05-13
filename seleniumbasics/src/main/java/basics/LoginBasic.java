package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.className("ico-login"));
		element1.click();
		WebElement element2=driver.findElement(By.id("Email"));
		element2.sendKeys("noorajahangeer1996@gmail.com");
		WebElement element3=driver.findElement(By.id("Password"));
		element3.sendKeys("noora1996");
		WebElement element4=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		element4.click();
	}

}
