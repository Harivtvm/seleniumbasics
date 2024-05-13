package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));     //intialize web element
		//WebElement obj2;  //null value
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchfield.click();
		searchfield.sendKeys("smartphone");  //to send data to field
		searchfield.clear();  //clear data
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emaild=driver.findElement(By.name("email"));
		emaild.click();
		emaild.sendKeys("hari");*/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement classname1=driver.findElement(By.className("inputtext _55r1 _6luy"));
		classname1.click();
	}

}
