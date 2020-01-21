import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.Alert;  
public class alert_test {  
  
    public static void main(String[] args) {  
          
        // System Property for Gecko Driver   
        System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );  
              
        // Initialize Gecko Driver using Desired Capabilities Class  
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
            capabilities.setCapability("marionette",true);  
            WebDriver driver= new FirefoxDriver(capabilities);  
          
  
        // Launch Website  
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
  
        //Handling alert boxes  
        //Click on generate alert button  
        driver.findElement(By.linkText("Generate Alert Box")).click();  
          
        //Using Alert class to first switch to or focus to the alert box  
        Alert alert = (Alert) driver.switchTo().alert();  
          
        //Using accept() method to accept the alert box  
        alert.accept();  
          
        //Handling confirm box  
        //Click on Generate Confirm Box  
        driver.findElement(By.linkText("Generate Confirm Box")).click();  
          
          
        Alert confirmBox = (Alert) driver.switchTo().alert();  
          
        //Using dismiss() command to dismiss the confirm box  
        //Similarly accept can be used to accept the confirm box  
        ((Alert) confirmBox).dismiss();  
  
  
      
    }  
  
}
