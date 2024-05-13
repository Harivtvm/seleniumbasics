package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Navigation{
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.in/");
			driver.navigate().to("https://www.flipkart.com/");
			driver.navigate().to("https://www.facebook.com/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();                  //inbuild method for refresh
	}
}
