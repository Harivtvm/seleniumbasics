package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
		boolean a = male.isDisplayed();
		boolean b = female.isDisplayed();
		System.out.println(a);
		System.out.println(b);
		female.click();
		boolean c = male.isSelected();
		boolean d = female.isSelected();
		System.out.println(c);
		System.out.println(d);

	}

}
