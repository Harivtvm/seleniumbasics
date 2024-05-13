package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAssign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
