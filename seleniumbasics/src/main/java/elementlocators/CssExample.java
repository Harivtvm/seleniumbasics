package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));  //by css method id
		searchfield.click();
		WebElement user=driver.findElement(By.cssSelector(".inputtext._55r1._6luy"));    //by css class
		user.click();
		user.sendKeys("hari");
		WebElement search=driver.findElement(By.tagName("select"));
		search.click();
		
		}

}
