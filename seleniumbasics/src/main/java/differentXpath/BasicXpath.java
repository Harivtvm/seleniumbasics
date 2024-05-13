package differentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//tagName[@attribute='attribute value']   syntax for xpath
		WebElement sear=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sear.click();
		sear.sendKeys("watch");
	}

}
