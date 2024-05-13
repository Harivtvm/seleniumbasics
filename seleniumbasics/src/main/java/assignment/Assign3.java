package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php/");
		driver.manage().window().maximize();
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.click();
		message.sendKeys("Hello dude");
		WebElement show = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		show.click();
		//parentTag[@attribute='value']//childTag[@attribute='value']
		//tagname[contains(text(),'yourtext')]

		//tagName[contains(@attribute,'value')]                   for url
		//tagName[starts-with(@attribute,'value')]                  for url
	}

}
