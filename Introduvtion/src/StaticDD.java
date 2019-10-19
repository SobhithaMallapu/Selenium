import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDD {
	public static void main(String [] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	
	//for static drop downs
	
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	s.selectByValue("AED");	
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000L);
	int i = 1;
	while(i<4) {
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	// for dynamic drop downs
	
	Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click());
	
	a.selectByXpath("(//a[@value='BLR'])").click();
	
	Thread.sleep(2000l);
	
	a.selectByXpath("(//a[@value='AMD'])[2]").click();
	
	

	}
}
