import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code
		//create driver object for chrome browser
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		/*driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("This is it");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();*/
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("Input[@name='Login']")).sendKeys("Sobhitha");
		
		driver.findElement(By.name("pw")).sendKeys("abcdef");
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		/*driver.get("http://facebook.com");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Sobhithamallapu009@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("inkypinky");
		
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();*/
		
}
}	