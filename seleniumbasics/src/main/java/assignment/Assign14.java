package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign14 {
	public static void main(String[] args) {

			System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.qabible.in/dynamic-load.php");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			
			WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			element1.click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h5[@class='card-title']"))); 
			WebElement element2=driver.findElement(By.xpath("//h5[@class='card-title']"));
			System.out.println(element2.getText());
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='card text-center']//img"))); 
			WebElement element3=driver.findElement(By.xpath("//div[@class='card text-center']//img"));
			System.out.println(element3.isDisplayed());

	}

}
