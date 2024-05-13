package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEg1 {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element1=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		element1.click();
		WebElement cancel=driver.findElement(By.xpath("//button[contains(text(),'Cancel Download')]"));
		wait.until(ExpectedConditions.invisibilityOf(cancel));
		WebElement text=driver.findElement(By.xpath("//div[@class='progress-label']"));
		System.out.println(text.getText());
		WebElement close=driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']"));
		close.click();
	}

}
