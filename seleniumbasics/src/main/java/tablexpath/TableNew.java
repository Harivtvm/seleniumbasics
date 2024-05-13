package tablexpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableNew {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(
				By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tr[4]//td[3]"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(
				By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tr[9]//td[5]"));
		System.out.println(element2.getText());
		

	}

}
