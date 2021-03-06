package Section_13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_Assgn {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.id("product"));
		
		int rowcount = table.findElements(By.tagName("tr")).size();
		
		System.out.println("Row count: "+rowcount);
		
		int colcount = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		
		System.out.println("Column count: "+colcount);
		
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondRow.get(0).getText());
		
		System.out.println(secondRow.get(1).getText());
		
		System.out.println(secondRow.get(2).getText());
				 
	}
	

}
