package Arraylist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownInput {

	public static void main(String[] args) {
		String state="Oregon";               //using variable
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.manage().window().maximize();
		WebElement like= driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		like.click();
		WebElement next= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		next.click();
		next.sendKeys(state);  //use variable
		//WebElement ele= driver.findElement(By.xpath("//li[text()='Nevada']"));
		//ele.click();
		WebElement ele1=driver.findElement(By.xpath("//li[contains(text(),'"+state+"')]")); //concat //use variable
ele1.click();


	}

}
