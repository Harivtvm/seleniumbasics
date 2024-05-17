package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neweg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		element1.sendKeys("hari");
		WebElement element2=driver.findElement(By.xpath("//button[@id='button-one']"));
		element2.click();
		WebElement element3=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(element3.getText());
		
	}

}
