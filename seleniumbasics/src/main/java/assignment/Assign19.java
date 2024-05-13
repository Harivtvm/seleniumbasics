package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/window-popup.php");
		WebElement element1=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		element1.click();
		String main=driver.getWindowHandle();
		Set<String> idlist=driver.getWindowHandles();
		for(String window:idlist) {
			if(!main.equals(window)) {
				driver.switchTo().window(window);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		
driver.quit();
	}

}
