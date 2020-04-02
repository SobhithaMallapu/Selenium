package Section_9;


	

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



	public class ItemstocartSerirs {

	

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String[] itemsNeeded = {"Cucumber","Brocolli","Beetroor"};
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise"); // URL in the browser
			
			java.util.List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			
			for(int i=0;i<products.size();i++)
			{
				String name = products.get(i).getText();
				
				List itemsNeededList = Arrays.asList(itemsNeeded);
				
				
				if(name.contains(name))
				{
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				}
			}
			
			

}
}
	