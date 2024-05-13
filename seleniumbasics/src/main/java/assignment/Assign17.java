package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign17 {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		Actions action=new Actions(driver);
		action.click(element1).build().perform();
		WebElement element2=driver.findElement(By.xpath("(//input[@class='check-box-list'])[1]"));
		WebElement element3=driver.findElement(By.xpath("(//input[@class='check-box-list'])[2]"));
		WebElement element4=driver.findElement(By.xpath("(//input[@class='check-box-list'])[3]"));
		WebElement element5=driver.findElement(By.xpath("(//input[@class='check-box-list'])[4]"));
		action.click(element2).build().perform();
		action.click(element3).build().perform();
		action.click(element4).build().perform();
		action.click(element5).build().perform();
		System.out.println("selection of element1 is "+element1.isSelected());
		//System.out.println("selection of element2 is "+element2.isSelected());
		//System.out.println("selection of element3 is "+element3.isSelected());
		//System.out.println("selection of element4 is "+element4.isSelected());
		//System.out.println("selection of element5 is "+element5.isSelected());;
List<WebElement> list=driver.findElements(By.xpath("(//input[@class='check-box-list'])"));
for(WebElement elemen:list) {
	System.out.println("selection of element is "+elemen.isSelected());
	
}
	}

}
