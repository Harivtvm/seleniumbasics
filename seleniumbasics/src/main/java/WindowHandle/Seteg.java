package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seteg {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//a[text()='Click Here']"));
		String parentwindow=driver.getWindowHandle();
		element1.click();
		//element1.click();
		//WebElement element2=driver.findElement(By.xpath("//h3[text()='New Window']"));
		//element2.click();
		
		System.out.println(parentwindow);
		Set<String> b=driver.getWindowHandles();
		System.out.println(b);
		System.out.println(b.size());
	//	Iterator<String> iterate=b.iterator();
	//	while (iterate.hasNext()) {
		//	String windowid=iterate.next();
			for(String windowid:b) {

			if (!parentwindow.equals(windowid)) {    //comparing 2 strings
				driver.switchTo().window(windowid);
				WebElement element3=driver.findElement(By.xpath("//h3[text()='New Window']"));
				System.out.println(element3.getText());
			}
			}
		
		driver.close();
		//WebElement element3=driver.findElement(By.xpath("//h3[text()='New Window']"));
		//System.out.println(element3.getText());
		
	}
}
	