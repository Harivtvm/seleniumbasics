package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RevisionWait {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
element1.click();
//Thread.sleep(8000);
WebElement element2=driver.findElement(By.xpath("//h5[@class='card-title']"));
System.out.println(element2.getText());
WebElement element3=driver.findElement(By.xpath("//div[@class='card text-center']"));
System.out.println(element3.isDisplayed());
	}

}