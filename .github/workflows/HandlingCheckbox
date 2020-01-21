package mypack;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class Checkbox_test   
{  
  
public static void main(String[] args)   
{  
        // TODO Auto-generated method stub  
        System.setProperty("webdriver.chrome.driver","C:\\\\work\\\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.navigate().to("https://www.spicejet.com/");  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
  
driver.close();  
    }  
  
}
