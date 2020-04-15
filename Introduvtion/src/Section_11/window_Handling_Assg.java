package Section_11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_Handling_Assg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//*[@id="content"]/div/a
		
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		
		System.out.println(driver.getTitle());
		
		Set <String> aids = driver.getWindowHandles();
		
		Iterator <String> ait = aids.iterator();
		String aparentId = ait.next();
		String achildId = ait.next();
		
		driver.switchTo().window(achildId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(aparentId);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}

}
