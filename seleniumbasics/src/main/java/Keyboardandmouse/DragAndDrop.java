package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source= driver.findElement(By.xpath("//div[@class='ui-widget-content']//li[2]"));
		WebElement destination= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
		//actions.dragAndDrop(source, destination).build().perform();

}
}
