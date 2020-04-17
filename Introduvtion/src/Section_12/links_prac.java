package Section_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1.Give the count of links present in the page
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\TatambariBaba\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	 System.out.println(driver.findElements(By.tagName("a")).size());
	 
	 WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	 
	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
	 
	 WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 
	 System.out.println(columndriver.findElements(By.tagName("a")).size());
	 	
		driver.close();
	}

}
