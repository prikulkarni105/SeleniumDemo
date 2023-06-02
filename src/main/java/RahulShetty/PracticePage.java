package RahulShetty;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PracticePage {

	static String url="https://rahulshettyacademy.com/AutomationPractice/";
	
	@Test
	public static void assignment1() throws Exception
	{
		WebDriver driver=InitDriver.startDriver(url);
/*		
// (1). RadioButton
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		Thread.sleep(2000);
		
// (2). Suggession Class Example
		driver.findElement(By.id("autocomplete")).sendKeys("Aus");
		driver.findElement(By.xpath("//ul/li/div[contains(text(),'Austria')]")).click();
		Thread.sleep(2000);
		
// (3). Dropdown Example
		Select se1=new Select(driver.findElement(By.id("dropdown-class-example")));
		se1.selectByVisibleText("Option3");
		Thread.sleep(1000);
		
		Select se2=new Select(driver.findElement(By.id("dropdown-class-example")));
        se2.selectByIndex(1);
        Thread.sleep(2000);
		
// (4). Checkbox Example
        driver.findElement(By.id("checkBoxOption2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(2000);
        
// (5). Switch Window Example
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        String originalwindow= driver.getWindowHandle();  //take id of first window
        System.out.println(originalwindow);
        
        
        Set<String> multiwindow = driver.getWindowHandles();   //take ids of all windows
        
        for (String id : multiwindow)  //code for switch to window
        {
			if(id.equals(originalwindow))
			{
				
			}
			else
			{
				driver.switchTo().window(id);
			}
		}
        
        System.out.println(driver.getTitle());
        driver.close();
        
        //for coming back to original window
        driver.switchTo().window(originalwindow);
        Thread.sleep(2000);
               
// (6). Switch Tab Example
       driver.findElement(By.id("opentab")).click();
       String originaltab= driver.getWindowHandle();
       System.out.println(originaltab);
       
       Set<String> multitab= driver.getWindowHandles();
        
       for (String tabid : multitab)
       {
		
    	   if(tabid.equals(originaltab))
		   {
			
		   }
    	   else
    	   {
    		   driver.switchTo().window(tabid);
    	   }
	   }
       String tabtext= driver.findElement(By.xpath("//span[text()='info@qaclickacademy.com']")).getText();
       System.out.println(tabtext);
       Thread.sleep(2000);
       driver.close();
       
       //coming back to original tab
       driver.switchTo().window(originaltab);
   
		
// (7). Switch To Alert Example   
       String name="Priyanka";
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
       driver.findElement(By.id("alertbtn")).click();
       Thread.sleep(2000);
       driver.switchTo().alert().accept();
       
       //alert input text validation code snippet
       driver.findElement(By.id("confirmbtn")).click();  
       String alerttext=   driver.switchTo().alert().getText();
       try 
       {
    	   if(alerttext.contains(name))
           {
    		   Thread.sleep(2000);
    		   driver.switchTo().alert().accept();
           }
    	   else
    	   {
    		   driver.switchTo().alert().dismiss();

    	   }
           
	   } 
       
       catch (Exception e) 
       {
		// TODO: handle exception
    	   System.out.println("kaitari chuklay..alert nit check kr");
	   }
       
// (8). Element Displayed Example
       driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("demo");
       driver.findElement(By.id("hide-textbox")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("show-textbox")).click();
       Thread.sleep(2000);
*/
		
// (9). Mouse Hover Example
     
	   Actions act=new Actions(driver);
		
       JavascriptExecutor js = (JavascriptExecutor) driver;

       js.executeScript("scrollBy(0,1000)");
       Thread.sleep(5000);
       act.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div/a[text()='Top']")).click();
       
       js.executeScript("scrollBy(0,1000)");
	   Actions act1=new Actions(driver);
       Thread.sleep(2000);
       act1.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div/a[contains(text(),'Reload')]")).click();
       Thread.sleep(2000);
       
// (10). iFrame Example
       driver.switchTo().frame("courses-iframe").findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']")).click();
       
       
       
       
       
       
       
		driver.quit();
	}
	
}
