package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//a[text()='Click Here']"));
		String parentwindow=driver.getWindowHandle();
		element1.click();
		element1.click();
		System.out.println(parentwindow);
		Set<String> b=driver.getWindowHandles();
		for(String windowid:b){
			if (parentwindow.equals(windowid)) { 
				System.out.println("no need");
			}
			else {
				driver.switchTo().window(windowid);}
				
			}
		Thread.sleep(5000);
			driver.close();	
			driver.quit();
			}
		
	}


