package sec8_dynamictools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec_8_Assignment {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); //URL in the browser	 
		
		WebElement radio1 = driver.findElement(By.id("OneWay"));
		radio1.click();
		
		driver.findElement(By.id("DepartDate")).click();
		
		//driver.findElement(By.ByLinkText("ui-state-default ui-state-highlight ui-state-active")).click();
		
		// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		//driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		driver.findElement(By.id("SearchBtn")).click();
					
	}

}
