package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implisitwait {
//global wait,declared once,aplicable to driver
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			WebElement element1=driver.findElement(By.xpath("//button[text()='Start']"));
	element1.click();
	WebElement element2=driver.findElement(By.xpath("//div[@id='finish']//h4"));
	System.out.println(element2.getText());

	}

}
