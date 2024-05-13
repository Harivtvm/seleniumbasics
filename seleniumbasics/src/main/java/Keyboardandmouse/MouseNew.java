package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseNew {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement element3 = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		Actions actions=new Actions(driver);
		//actions.click().build().perform();
		//actions.click(element3).build().perform();              // click at element
		//actions.contextClick().build().perform();               // rightclick at pointer
		///actions.contextClick(element1).build().perform();         // rightclick on element
		//actions.doubleClick().build().perform();                            // double click
		actions.doubleClick(element2).build().perform();
	}

}
