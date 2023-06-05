package GreenKart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class GoToCart {

	public static void checkCart(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();  //click on main cart
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();    //click on proceed to checkout
		
		//check total amount
		List<WebElement> totalamount= driver.findElements(By.xpath("//tr/td[5]"));
		
		int addedamount=0;
		
		for(int i=0; i<totalamount.size(); i++)
		{
			if(totalamount.get(i).getText().equals("Total"))
			{
				
			}
			else
			{
				
				addedamount=addedamount+Integer.parseInt(totalamount.get(i).getText());  //add all amount 
			}
		}
		
        int OriginalTotal=Integer.parseInt(driver.findElement(By.xpath("//span[@class='totAmt']")).getText());
        
        if(addedamount==OriginalTotal)
        {
        	System.out.println(addedamount+"=="+OriginalTotal);
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        }
        else
        {
        	System.out.println(addedamount+"=="+OriginalTotal);
        }
		
        Thread.sleep(3000);
        Select se=new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));  //select India
        se.selectByValue("India");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();    //click on checkbox
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        Thread.sleep(3000);
        driver.quit();

	}
	
}
