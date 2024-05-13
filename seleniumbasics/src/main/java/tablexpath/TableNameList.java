package tablexpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableNameList {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.get("https://selenium.qabible.in/table-filter.php");
		driver.manage().window().maximize();
		
		/*List<WebElement> tablelist=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//td[1]"));
		for(WebElement element:tablelist) {
			System.out.println(element.getText());
		}
		List<WebElement> tablelist1=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tr[3]//td"));
		for(WebElement element:tablelist1) {
			System.out.println(element.getText());
		}
		*/
		WebElement element=driver.findElement(By.xpath("//select[@name='example_length']//option[4]"));
		element.click();
		List<WebElement> tablelistname=driver.findElements(By.xpath("//table[@id='example']//td[1]"));
		String exp="Brenden Wagner";
		for(WebElement elem:tablelistname) {
			String act=elem.getText();
			if(exp.equals(act)) {
				System.out.println("found"+exp);}
			
				
			}
		
		}		

	}

 
