package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomepageOperations {

	public static void addToCart(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("pi"); //search for pista
		driver.findElement(By.xpath("//a[@class='increment']")).click(); //add one more element
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click(); //click on add to cart
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.CONTROL+"a") ;   //clear inserted text
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.BACK_SPACE) ;   //clear inserted text

		Thread.sleep(2000);
	}
	
}
