package com.swiggy.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import com.swiggy.pages.Landingpage;
import com.swiggy.pages.RestaurantsPage;



public class Driver extends Tools {

	protected static Landingpage landingPage;
	protected static RestaurantsPage restaurantsPage;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 landingPage = new Landingpage(driver);
		 restaurantsPage = new RestaurantsPage(driver);
		
	}

	
}
