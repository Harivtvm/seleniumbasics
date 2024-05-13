package Keyboardandmouse;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadusingsendkey {

	public static void main(String[] args) {
		System.setProperty("windows.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//input[@id='file-upload']"));
	String filepath="C:\\Users\\user\\Downloads\\Licence fee.pdf";
	element1.sendKeys(filepath);
	//File file=new File("C:\\Users\\user\\Downloads\\Licence fee.pdf");  //optional method
	//element1.sendKeys(file.getAbsolutePath());
			

	}

}
