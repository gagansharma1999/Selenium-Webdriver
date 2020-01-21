package mypack;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Class1 {  
    public static void main(String[] args) {  
          
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.get("file:///C:/Users/admin/Desktop/radio.html");  
        int a = driver.findElements(By.xpath("//input [@name='group1']")).size();  
        System.out.println(a);  
        for(int i=1;i<=a;i++)  
        {  
            driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();  
        }  
    }}  
