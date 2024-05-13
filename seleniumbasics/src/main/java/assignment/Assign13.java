package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign13 {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		element1.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement element2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		element2.click();
		driver.switchTo().alert().dismiss();
		WebElement element3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		element3.click();
		driver.switchTo().alert().sendKeys("its an alert");
		driver.switchTo().alert().accept();
	}

}
