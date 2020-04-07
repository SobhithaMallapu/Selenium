package Section_9;
    
    import org.openqa.selenium.By;
    
    import java.util.Arrays;
    import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    
    public class ItemstocartSerirs {
    
    
    
        public static void main(String[] args) throws InterruptedException {
    
    
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\TatambariBaba\\Documents\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
            String[] itemsNeeded = {
                "Cucumber",
                "Brocolli",
                "Beetroot"
            };
            driver.get("https://rahulshettyacademy.com/seleniumPractise"); // URL in the browser
            Thread.sleep(3000);
            addItems(driver, itemsNeeded);
            
            
            driver.findElement(By.cssSelector("img[alt='Cart']")).click();
            driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
            driver.findElement(By.cssSelector("button.promoBtn")).click();
            System.out.println(driver.findElement(By.cssSelector("span.promoInfo")));
             
        }
    
        public static void addItems(WebDriver driver, String[] itemsNeeded) {
            int j = 0;
            List < WebElement > products = driver.findElements(By.cssSelector("h4.product-name"));
    
            for (int i = 0; i < products.size(); i++) {
                //Brocolli - 1 Kg
    
                //Brocolli,    1 kg
    
                String[] name = products.get(i).getText().split("-");
    
                String formattedName = name[0].trim();
    
                //format it to get actual vegetable name
    
                //convert array into array list for easy search
    
                //  check whether name you extracted is present in arrayList or not-
    
                List<String> itemsNeededList = Arrays.asList(itemsNeeded);
    
                if (itemsNeededList.contains(formattedName))
    
                {
    
                	
                    j++;
    
                    //click on Add to cart
    
                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
    
                    if (j == itemsNeeded.length)
    
                    {
    
                        break;
    
                    }
    
                }
    
            }
    
        }
    
    
    
    
    
        /*
         * java.util.List<WebElement> products =
         * driver.findElements(By.cssSelector("h4.product-name"));
         * 
         * for(int i=0;i<products.size();i++) { String name = products.get(i).getText();
         * 
         * List<String> itemsNeededList = Arrays.asList(itemsNeeded);
         * 
         * 
         * if(itemsNeededList.contains(name)) {
         * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(
         * ); } }
         */
    
    }