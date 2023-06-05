package GreenKart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MainLogic {

	@Test
	public static void finalExecution() throws InterruptedException
	{
	  WebDriver driver=	InitDriver.startDriver();
	  HomepageOperations.addToCart(driver);
	  GoToCart.checkCart(driver);
	}
	
}
