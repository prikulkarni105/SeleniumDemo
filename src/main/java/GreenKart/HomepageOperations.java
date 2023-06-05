package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HomepageOperations {

	public static void addToCart(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("pi"); //search for pista
		Thread.sleep(3000);
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='+']"))
				.below(By.xpath("//h4[text()='Pista - 1/4 Kg']"))).click();    //add one more element
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']"))
				.below(By.xpath("//h4[text()='Pista - 1/4 Kg']"))).click();    //Pista add to cart
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL+"a") ;   //clear inserted text
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.BACK_SPACE) ;   //clear inserted text

		Thread.sleep(3000);
		
	//	//h4[contains(text(), 'Corn')]//following::button[contains(text(),'ADD TO CART')][1]   
		driver.findElement(RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']")).below(By.xpath("//h4[text()='Corn - 1 Kg']"))).click();
		
		//increment raspberry by quantity one and added to cart
		Thread.sleep(3000);
		driver.findElement(RelativeLocator.with(By.xpath("//a[@class='increment']"))
				.below(By.xpath("//h4[text()='Raspberry - 1/4 Kg']"))).click();
		Thread.sleep(3000);   //increment quantity
		
		driver.findElement(RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']"))
				.below(By.xpath("//h4[text()='Raspberry - 1/4 Kg']"))).click();   //add to cart
		Thread.sleep(3000);
		
		//add to cart grapes
		driver.findElement(RelativeLocator.with(By.xpath("//button[text()='ADD TO CART']"))
				.below(By.xpath("//h4[text()='Grapes - 1 Kg']"))).click();   //add to cart
		Thread.sleep(3000);
		
	}
	
}
