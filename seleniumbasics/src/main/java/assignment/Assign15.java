package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign15 {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> footerlist=driver.findElements(By.xpath("//tfoot//th"));
		for(WebElement ele:footerlist) {
			System.out.println(ele.getText());
		}

	}

}
