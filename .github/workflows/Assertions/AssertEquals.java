package mypack;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox_test {
public static void main(String[] args)
{
 // TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\work\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.spicejet.com/");

//Assert.assertEquals(actual,expected);

Assert.assertEquals("5Adult",driver.findElement(By.id("divpaxinfo")).getText());

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
}}
