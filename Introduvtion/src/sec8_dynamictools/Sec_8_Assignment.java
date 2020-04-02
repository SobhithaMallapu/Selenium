package sec8_dynamictools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sec_8_Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/"); // URL in the browser
		
		int a =5;
		
		System.out.println("value:"+a);

		WebElement radio1 = driver.findElement(By.id("RoundTrip"));
		radio1.click();

		driver.findElement(By.id("DepartDate")).click();

		// driver.findElement(By.ByLinkText("ui-state-default ui-state-highlight
		// ui-state-active")).click();

		// driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight
		// ui-state-active']")).click();

		// driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));

		s.selectByVisibleText("3");

		Select c = new Select(driver.findElement(By.id("Childrens")));

		c.selectByIndex(2);

		Select i = new Select(driver.findElement(By.id("Infants")));

		i.selectByVisibleText("1");

		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.id("SearchBtn")).click();

		String msg = driver.findElement(By.id("homeErrorMessage")).getText();

		System.out.println("mymsg...:" + msg);

	}

}
