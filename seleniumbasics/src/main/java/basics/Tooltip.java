package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		//WebElement image= driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		//String a=image.getAttribute("title");
		//System.out.println(a);
		WebElement image1= driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
		String b=image1.getAttribute("title");
		//System.out.println(b);
		System.out.println(image1.isDisplayed());
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource().contains("image"));

	}

}
