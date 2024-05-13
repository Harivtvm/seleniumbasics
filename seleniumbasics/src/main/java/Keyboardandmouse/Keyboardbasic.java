package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardbasic {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element1.sendKeys("smartwatch");
		//element1.sendKeys("smartwatch"+Keys.ENTER);
		//element1.sendKeys(Keys.ENTER);
		element1.sendKeys(Keys.BACK_SPACE);
		element1.sendKeys(Keys.chord(Keys.CONTROL,"A")); // for ctrl+A

	}

}
