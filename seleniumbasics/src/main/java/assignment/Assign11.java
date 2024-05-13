package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		List<WebElement> filter=driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option"));
		for(WebElement element: filter){
			System.out.println(element.getText());
	}
	}
}

 