package Keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousebasic {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//a[@href='https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(element1).build().perform();
	int x=element1.getLocation().getX();
	int y=element1.getLocation().getY();
	actions.moveByOffset(x, y).build().perform();
	actions.moveByOffset(x, x).build().perform();

	}

}
