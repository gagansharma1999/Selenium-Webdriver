package mypack;
import org.junit.Assert;
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
 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

 //Assert.AssertTrue(condition);

 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

 }

}
