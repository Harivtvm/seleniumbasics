package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetmsgEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement head= driver.findElement(By.xpath("//div[contains(text(),'Bootstrap Alert')]"));
		String a=head.getAttribute("class");
		System.out.println(a);
		
		WebElement button= driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		String b=button.getAttribute("id");
		String c=button.getCssValue("background-color");//color font-size font-style
		String d=button.getCssValue("color");
		String e=button.getCssValue("font-size");
		String f=button.getCssValue("font-style");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
