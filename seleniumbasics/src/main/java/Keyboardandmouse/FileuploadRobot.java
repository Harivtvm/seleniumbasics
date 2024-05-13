  package Keyboardandmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		//JavascriptExecutor js =  (JavascriptExecutor) driver; //explicit type casting
		//js.executeScript("alert('hari')");
		WebElement element1=driver.findElement(By.xpath("//input[@id='file-upload']"));
		String filepath="C:\\Users\\user\\Downloads\\Licence fee.pdf";
		Actions action=new Actions(driver);
		//element1.click();
		Robot robot=new Robot();
		Thread.sleep(1000);
		action.moveToElement(element1).click().perform();
		
		StringSelection ss = new StringSelection(filepath);                             //for copying filepath to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
   