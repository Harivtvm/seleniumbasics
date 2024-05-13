package Arraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayeg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Localdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	//	List<WebElement> menuElementList=driver.findelements(By.xpath())
List<WebElement> menuElementList=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a")); //use find element's'
System.out.println(menuElementList.size());
for(int i=0;i<menuElementList.size();i++) {
String text=menuElementList.get(i).getText();
System.out.println(text);
}
//for(WebElement element: listName){}
for(WebElement element: menuElementList){
	System.out.println(element.getText());
}
for(WebElement element: menuElementList){
	System.out.println(element.getAttribute("class"));
}
for(WebElement element: menuElementList){
	System.out.println(element.getCssValue("background-color"));
}
	}

}
