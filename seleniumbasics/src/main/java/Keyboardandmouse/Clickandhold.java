package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions actions=new Actions(driver);
		actions.clickAndHold(element1).build().perform();
		//Thread.sleep(2000);
		actions.release(element1);
		actions.sendKeys(element1,"watch").build().perform();
		actions.keyDown(Keys.ENTER).build().perform();

		

	}

}
