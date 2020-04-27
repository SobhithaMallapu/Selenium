package Section_12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_prac {

	public static void main(String[] args) throws InterruptedException {
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
	 
	 
	 //best automation step performed in your automation career @Interview
	 //opening multiple windows and displaying page names
	 
	 for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		 
	 {
		String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		 Thread.sleep(5000L);
	 }
		 Set<String> abcs=driver.getWindowHandles();
		 Iterator<String> it = abcs.iterator();
		 
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 } 
	 
	}

}
