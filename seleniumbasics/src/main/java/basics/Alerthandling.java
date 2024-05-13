package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		
		WebElement element2=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement element3=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		element1.click();
		driver.switchTo().alert().accept();
		element2.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		element2.click();
		driver.switchTo().alert().accept();
		element3.click();
		driver.switchTo().alert().sendKeys("hai");
		driver.switchTo().alert().accept();
	}

}
