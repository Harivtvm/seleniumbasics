package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement linktest=driver.findElement(By.linkText("Forgotten password?"));
		//linktest.click();
		//WebElement plinktest=driver.findElement(By.partialLinkText("Forgotten "));
		//plinktest.click();
		WebElement amaz=driver.findElement(By.linkText("Customer Service"));
		amaz.click();
	}

}
