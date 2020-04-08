package Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asg_ExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
	    
	    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //Explicit Wait
        WebDriverWait w = new WebDriverWait(driver,5);
        
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        
        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id ='results']")));
        
        System.out.println(driver.findElement(By.xpath("//div[@id ='results']")).getText());
         
    }

}
