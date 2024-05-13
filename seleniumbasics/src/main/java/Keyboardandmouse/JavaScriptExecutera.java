package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutera {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor) driver; //explicit type casting
		js.executeScript("window.scrollBy(0,1000)");
		WebElement element1=driver.findElement(By.xpath("//a[text()='Become an Affiliate']"));
		js.executeScript("arguments[0].scrollIntoView();",element1);
		js.executeScript("arguments[0].click();",element1);

	}

}
