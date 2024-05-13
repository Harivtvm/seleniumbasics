package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement msg = driver.findElement(By.xpath("//input[@placeholder='Message']"));
		msg.sendKeys("Hello");
		WebElement save = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		save.click();
		WebElement getmsg = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(getmsg.getText());

	}

}
