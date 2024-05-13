package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Fluentwait {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
	
		WebElement element1=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		element1.click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L)).pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']")));
WebElement element3=driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']"));
System.out.println(element3.isDisplayed());
WebElement element2=driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='Close']"));
System.out.println(element2.getText());
element2.click();
	}

}
