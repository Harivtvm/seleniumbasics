package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		/*WebElement show=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		boolean check1status=show.isSelected();
		System.out.println(check1status);
		WebElement show1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		boolean check2status=show1.isSelected();
		System.out.println(check2status);
		//driver.quit();    // close entire tab
		//driver.close();    //close current tab
		if (check1status==false)
			show.click();
		if (check2status==false)
			show1.click();*/
		WebElement show2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		boolean check3status=show2.isDisplayed();
		System.out.println(check3status);
		WebElement show3=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		boolean check4status=show3.isDisplayed();
		System.out.println(check4status);
	}

}
