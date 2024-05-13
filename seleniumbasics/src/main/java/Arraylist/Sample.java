package Arraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		/*WebElement element=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul//li[2]//a"));
		element.click();
		WebElement element1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		element1.click();
		element1.sendKeys("Hello");
		WebElement element2=driver.findElement(By.xpath("//button[@id='button-one']"));
		element2.click();*/
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele:list) {
			ele.click();
		}
				
	}

}
