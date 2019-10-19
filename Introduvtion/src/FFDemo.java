import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFDemo {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code
		//create driver object for chrome browser
		//
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TatambariBaba\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		// System.out.println(driver.getPageSource());
		
		// driver.get("http://yahoo.com");
		
		// driver.navigate().back();
		
		driver.close();
}
}
 