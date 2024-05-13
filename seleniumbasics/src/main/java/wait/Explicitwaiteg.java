  package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaiteg {

		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));    //step 1
			WebElement element1=driver.findElement(By.xpath("//button[text()='Start']"));
			wait.until(ExpectedConditions.elementToBeClickable(element1));   //step 2
	element1.click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='finish']//h4")));  //step 3
	WebElement element2=driver.findElement(By.xpath("//div[@id='finish']//h4"));
	System.out.println(element2.getText());

	}

}
