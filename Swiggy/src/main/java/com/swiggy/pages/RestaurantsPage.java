package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RestaurantsPage {
	
	private Actions actions;
	private WebDriverWait wait;
		 @FindBy(xpath = "(//div[contains(@class,'fPX')])[1]")
		 private WebElement restaurant;
		// By restaurant = By.xpath("(//div[contains(@class,'fPX')])[1]");
		 @FindBy(xpath="(//div[contains(@class,'RPO')])[1]")
		 private WebElement firstDish;
		// By firstDish = By.xpath("(//div[contains(@class,'RPO')])[1]");
		 @FindBy(xpath="//div[contains(@class,'fmV')]")
		 private WebElement cart;
		// By cart = By.xpath("//div[contains(@class,'fmV')]");
		 @FindBy(xpath="//div[contains(@class,'uP')]")
		 private WebElement checkout;
		// By  checkout = By.xpath("//div[contains(@class,'uP')]");
		 @FindBy(xpath="//div[contains(@class,'axtv')]")
		 private WebElement text;
		// By = By.xpath("//div[contains(@class,'axtv')]");
		 
		 
		  public RestaurantsPage(WebDriver driver) {
				
				PageFactory.initElements(driver, this);
				actions = new Actions(driver);
				wait = new WebDriverWait(driver,Duration.ofSeconds(60));
			}
		 public void clickrestaurant() {
				restaurant.click();
				
			}
		 public void firstdish() {
				firstDish.click();
				
			}
		 public void Cart() {
			 
			 actions.moveToElement(cart).build().perform();
			// actions.moveToElement(cart).build().perform();
				
			}
		 
		 public void checkOut() {
				checkout.click();
				
			}
		 public String getMsg() {
				String message = text.getText();
				return message;
			}
			
	}


