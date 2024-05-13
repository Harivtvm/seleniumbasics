package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTextEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		//WebElement show=driver.findElement(By.xpath("//button[@id='button-one']"));
		//String s=show.getText();
		//System.out.println(s);
		WebElement show1=driver.findElement(By.xpath("//a[@id='progress-bars']"));
		String a=show1.getText();
		System.out.println(a);
		
	}

}
