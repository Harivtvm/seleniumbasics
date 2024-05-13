package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		//driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));          
		//male.click();
		//WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		//female.click();
		//WebElement clicking = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		//clicking.click();
		//WebElement fbclick = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	//	fbclick.click();
		WebElement inputform= driver.findElement(By.xpath("//a[contains(text(),'Input ')]"));
		inputform.click();
		WebElement form= driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/r')]"));
		form.click();
		
	}

}
