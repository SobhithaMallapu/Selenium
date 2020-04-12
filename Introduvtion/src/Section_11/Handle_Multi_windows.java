package Section_11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multi_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		//*[@id="initialView"]/footer/ul/li[1]/a
		
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		Set <String> ids = driver.getWindowHandles();
		
		Iterator <String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		

	}

}
