package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","G:\\Localdriver\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		//System.setProperty("webdriver.firefox.driver","G:\\Localdriver\\gecodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		String amazontitle=driver.getTitle();
		System.out.println(amazontitle);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.get(currenturl);
		
	}
	
	
	}

 