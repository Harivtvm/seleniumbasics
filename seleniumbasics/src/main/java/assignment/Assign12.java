package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		WebElement sample= driver.findElement(By.xpath("//select[@id='select-menu']"));
		Select select=new Select(sample);   
		select.selectByVisibleText("5-9");
	}

}
