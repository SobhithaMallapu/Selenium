package sec8_dynamictools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/"); //URL in the browser
		//driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		//driver.findElement(By.xpath("//input[@class='fsw_inputField font30 lineHeight36 latoBlack']")).clear();
		WebElement ele1=driver.findElement(By.id("fromCity"));
		System.out.println(ele1.toString());
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		Thread.sleep(1000);
		
		/**click working on place holder locator only **/
		WebElement element = driver.findElement(By.xpath("//input[@placeholder='From']"));
		element.click();
		Thread.sleep(1000);
		element.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		element.sendKeys(Keys.ENTER);
		
		
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(1000);
		for(int i=0; i<=3; i++)
		{
		element2.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(1000);
		element2.sendKeys(Keys.ENTER);
	}
	
}
