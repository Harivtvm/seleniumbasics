package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign18 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/window-popup.php");
		WebElement element1=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		element1.click();
		String par=driver.getWindowHandle();
		Set<String> winid=driver.getWindowHandles();
		for(String id:winid) {
			if(!par.equals(id)) {
				driver.switchTo().window(id).manage().window().maximize();
			}
		}
		Thread.sleep(3000);
		WebElement element2=driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']"));
		System.out.println(element2.getText());
		driver.close();
		driver.quit();

	}

}
