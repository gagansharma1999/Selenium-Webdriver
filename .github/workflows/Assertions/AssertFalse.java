package mypack;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox_test {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\\\work\\\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("https://www.spicejet.com/");

 Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

 //if we use:
 //Assert.assertFalse(true);
 //the assertion fails which means that the test case is also failed. Assertion failure will stop the execution by exception.

 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

 }

}
