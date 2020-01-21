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
  
  //In the above code, we haven't used the complete 'id' attribute value as it is very big. I have used the half part of the 'Senior Citizen' checkbox, and other half part is represented in the form of regular expression, i.e., '*='.
  
  //We have used two methods in the above code:
  //isSelected(): This method determines whether the checkbox is selected or not. If the checkbox is selected, then this method returns true otherwise false.
  //click(): This method selects the locator. In this case, it is selecting the "Senior Citizen" checkbox.
}  
  
}
