package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign16 {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		element1.click();
		List<WebElement> errorlist=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		for(WebElement ele:errorlist) {
			System.out.println(ele.getText());
		}


	}

}
