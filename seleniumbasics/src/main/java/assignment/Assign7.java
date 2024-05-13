package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement button= driver.findElement(By.xpath("//div[@class='col-md-6']//button[@id='autoclosable-btn-success']"));
boolean a=button.isDisplayed();
boolean b=button.isEnabled();
System.out.println(a);
System.out.println(b);
System.out.println(button.getText());
	}

}
