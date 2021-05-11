package com.pwc.pulse.digital.step.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLocators {
	

	WebDriver driver;

	By click_on_I_Understand_button = By.xpath("//button[@id='js-cookie-button']");
	By click_on_the_X_Icon= By.xpath("(//button[@class='subscribe-modal__close btr bt-times'])[1]");
	By get_the_count_of_articles = By.xpath("//li[@class='flex flex-active-slide']//child::div/div");
	By click_on_the_Next_Arrow_Icon= By.xpath("(//a[@class='flex-next']");
	By click_on_the_Prev_Arrow_Icon= By.xpath("(//a[@class='flex-prev']");
	By click_on_the_Contact_Link1= By.xpath("(//a[text()='Contact'])[1]");
	By click_on_the_Contact_Link2= By.xpath("(//a[text()='Contact'])[2]");
	By click_on_the_Contact_Link3= By.xpath("(//a[text()='Contact'])[3]");
	By click_on_the_Search_Icon= By.xpath("//i[@class='btr bt-search']");
	By enter_search_text= By.id("search-input");
	
	
	
	public PageLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	
public void enterTextinSearchField(String yourSearchText) {
		
		driver.findElement(enter_search_text).sendKeys(yourSearchText);
		
		
	}
public void pressEnterKey() {
	
	driver.findElement(enter_search_text).sendKeys(Keys.ENTER);
	
}
	
public void clickOnSearchIcon() {
		
		driver.findElement(click_on_the_Search_Icon).click();
		
	}
	public void clickOnContactButton1() {
		
		driver.findElement(click_on_the_Contact_Link1).click();
		
	}
	
public void clickOnContactButton2() {
		
		driver.findElement(click_on_the_Contact_Link2).click();
		
	}

public void clickOnContactButton3() {
	
	driver.findElement(click_on_the_Contact_Link3).click();
	
}

	public void clickOnIUnderstandButton() {
			
		driver.findElement(click_on_I_Understand_button).click();
		
	}

	public void clickontheXIcon() {
		
		driver.findElement(click_on_the_X_Icon).click();
		
	}

	public void gettheCountofArticles() {
		
		driver.findElements(get_the_count_of_articles).size();
	}
	
	public void clickontheNextArrowIcon() {

		driver.findElement(click_on_the_Next_Arrow_Icon).click();
				
	}
	
	public void clickonthePrevArrowIcon() {
		
		driver.findElement(click_on_the_Prev_Arrow_Icon).click();
		
	
	}
	




}



