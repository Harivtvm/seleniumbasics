package tablexpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableXpath {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		//WebElement element1=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr//th[3]"));
		//System.out.println(element1.getText());
		List<WebElement> tablelist=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tr//td"));
	
		for(WebElement element:tablelist) {
		System.out.println(element.getText());
	}
		System.out.println(tablelist.size());
	}

}
