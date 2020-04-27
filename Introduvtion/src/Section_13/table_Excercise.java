package Section_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_Excercise {
	
	public static void main(String[] args) {
		
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26774/slbpxi-vs-wi-one-day-practice-match-west-indies-tour-of-sri-lanka-2020");
		 
		//class="cb-col cb-col-100 cb-ltst-wgt-hdr"
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		    
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int integrvalue = Integer.parseInt(value);
			sum = sum + integrvalue;
		}
		

		System.out.println(sum);
		
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int integextras = Integer.parseInt(Extras);
		
		int tot = integextras + sum;
		System.out.println("total "+tot);
		
		
		System.out.println("main total "+driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		driver.close();
	}

}
