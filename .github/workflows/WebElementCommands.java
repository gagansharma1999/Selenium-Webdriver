//1. Clear Command
  element.clear();
  
    Code snippet:
    WebElement element = driver.findElement(By.id("UserName"));
    element.clear();  
               
//Or can be written as  
               driver.findElement(By.id("UserName")).clear();


//2. Sendkeys Command
  element.sendKeys("text");
    Code snippet:
    WebElement element = driver.findElement(By.id("UserName"));
    element.sendKeys("JavaTpoint");  
               
//Or can be written as  
               driver.findElement(By.id("UserName")).sendKeys("JavaTpoint");  


//3. Click Command
  element.click();
  
  Code snippet:
  WebElement element = driver.findElement(By.linkText("javaTpoint"));  
  element.click();  
               
//Or can be written as  
               driver.findElement(By.linkText("javaTpoint")).click();  


//4. IsDisplayed Command
  element.isDisplayed();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("UserName"));  
  boolean status = element.isDisplayed();  
               
//Or can be written as  
               boolean staus = driver.findElement(By.id("UserName")).isDisplayed();  


//5. IsEnabled Command
  element.isEnabled();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("UserName"));  
  boolean status = element.isEnabled();  
               
//Or can be written as  
               boolean staus = driver.findElement(By.id("UserName")).isEnabled();  
               
//Or can be used as  
  WebElement element = driver.findElement(By.id("userName"));  
  boolean status = element.isEnabled();  

// Check that if the Text field is enabled, if yes enter value  
if(status){  
element.sendKeys("javaTpoint");  
}  


//6. IsSelected Command
  element.isSelected();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("Sex-Male"));  
  boolean status = element.isSelected();  
               
//Or can be written as  
               boolean staus = driver.findElement(By.id("Sex-Male")).isSelected();  


//7. Submit Command
  element.submit();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("SubmitButton"));  
  element.submit();  
               
//Or can be written as  
               driver.findElement(By.id("SubmitButton")).submit();  


//8. GetText Command
  element.getText();  
  
  Code snippet:
  WebElement element = driver.findElement(By.xpath("anyLink"));  
  String linkText = element.getText();  


//9. GetTagName Command
  element.getTagName();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("SubmitButton"));  
  String tagName = element.getTagName();  
               
 //Or can be written as  
               String tagName = driver.findElement(By.id("SubmitButton")).getTagName();  


//10. getCssValue Command
  element.getCssValue();  


//11. getAttribute Command
  element.getAttribute();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("SubmitButton"));  
  String attValue = element.getAttribute("id"); //This will return "SubmitButton"  
  

//12. getSize Command
  element.getSize();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("SubmitButton"));  
  Dimension dimensions = element.getSize();  
  System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);  


//13. getLocation Command
  element.getLocation();  
  
  Code snippet:
  WebElement element = driver.findElement(By.id("SubmitButton"));  
  Point point = element.getLocation();  
  System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
