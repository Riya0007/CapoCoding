package stepDefinations;

import java.io.IOException;

import org.testng.log4testng.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Home;
import pages.ShoppingList;
import utilities.BaseTest;

public class Hooks {

	public ShoppingList sp;
	public Home hp;
    AndroidDriver<AndroidElement>driver;
    Logger log =Logger.getLogger(StepDefination.class);

	@Before("@smokesuite")
	public void setUp() throws IOException 
	{
		 driver = BaseTest.invokeDriver();
		 sp= new ShoppingList(driver);
		 hp = new Home(driver);
		 log.info("Set up is completed");
	}
	
	@After("@smokesuite")
	public void tearDown() 
	{
		driver.quit();
		log.info("Session Terminated");
	}
}
