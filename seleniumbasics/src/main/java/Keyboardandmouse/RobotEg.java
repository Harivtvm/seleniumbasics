package Keyboardandmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotEg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Robot robot=new Robot();
Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_DOWN);
	}

}
