package com.swiggy.pages;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landingpage {
	private WebDriver driver;
 private	Actions actions;
private	WebDriverWait wait;
	
	@FindBy(id ="location")
	private WebElement location;
	// By location = By.id("location");
	@FindBy(xpath="(//span[contains(@class,'W-T')])[1]")
	private WebElement autocompleteBox;
	public Landingpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	public void enterlocationname(String item) throws InterruptedException {
		location.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(autocompleteBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
}
