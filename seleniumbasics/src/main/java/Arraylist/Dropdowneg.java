package Arraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowneg {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.in/");
			driver.manage().window().maximize();
			WebElement like= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			Select select=new Select(like);   //applicable only for select tab
			select.selectByIndex(3);
			select.selectByValue("search-alias=stripbooks");
			select.selectByVisibleText("Alexa Skills");
			System.out.println(select.getOptions());//to get all webelements
	}

}
