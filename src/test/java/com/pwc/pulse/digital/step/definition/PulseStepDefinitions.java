package com.pwc.pulse.digital.step.definition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class PulseStepDefinitions {
	
	ReadData loadTestData = new ReadData();

	WebDriver driver; //creating webdriver object

	//LoadTestData test = new LoadTestData(); 
	
	@Given("I navigate to the PwC Digital Pulse website")
	public void i_navigate_to_the_PwC_Digital_Pulse_website() {

		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // initialize chromedriver 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(loadTestData.readPropfie().getProperty("url"));// getting the URl from config properties file

	}

	@When("I am viewing the {string} page")
	public void i_am_viewing_the_page(String string) {

		String actualTitle=driver.getTitle();
		String expectedTitle="Digital Pulse - Disruption, Innovation and Industry Change";
		assertEquals(actualTitle, expectedTitle); // verify the user is on the Home Page.
		
	}

	@Then("I am presented with a carousel displaying {int} featured articles")
	public void i_am_presented_with_a_carousel_displaying_featured_articles(Integer int1) {
		PageLocators locatores = new PageLocators(driver);
		locatores.clickOnIUnderstandButton(); // click on I Understand button
		locatores.clickontheXIcon(); //Click on the 'X' Icon
		
		int articlesCounts = driver.findElements(By.xpath("//li[@class='flex flex-active-slide']//child::div/div")).size();
		//int expectedCount = 3;
		//assertEquals(articlesCounts, int1); // verify the Articles count is 3.
		
		int intExpectedValues = int1.intValue();
		Assert.assertEquals(articlesCounts, intExpectedValues);
		System.out.println(articlesCounts);
		
	}




	@Then("Clicking the {string} button on the carousel will load the next {int} featured articles")
	public void clicking_the_button_on_the_carousel_will_load_the_next_featured_articles(String string, Integer int1) {
		PageLocators locatores = new PageLocators(driver);
		driver.findElement(By.xpath("//a[@class='flex-next']")).click(); //click on the Next Arrow icon
		//locatores.clickontheNextArrowIcon(); //click on the Next Arrow icon
		
	
			
		int articlesCounts = driver.findElements(By.xpath("//li[@class='flex flex-active-slide']//child::div/div")).size();
		
		int intExpectedValues = int1.intValue();
		Assert.assertEquals(articlesCounts, intExpectedValues); // verify the Articles count is 3.
		
		 
	}

	

	@Then("Clicking the {string} button on the carousel will load the previous {int} featured articles")
	public void clicking_the_button_on_the_carousel_will_load_the_previous_featured_articles(String string, Integer int1) throws InterruptedException {
		Thread.sleep(1000);
		PageLocators locatores = new PageLocators(driver);
		//locatores.clickonthePrevArrowIcon(); //click on the Previous  Arrow icon
		driver.findElement(By.xpath("//a[@class='flex-prev']")).click(); //click on the Previous  Arrow icon

		int articlesCounts = driver.findElements(By.xpath("//li[@class='flex flex-active-slide']//child::div/div")).size();
		int intExpectedValues = int1.intValue();
		Assert.assertEquals(articlesCounts, intExpectedValues); // verify the Articles count is 3.
		Thread.sleep(2000);
		String articleText1= driver.findElement(By.xpath("(//span[@class='article-type']//following::h2)[4]")).getText();
		System.out.println(articleText1);
		
		Assert.assertEquals(articleText1, loadTestData.readTestData().getProperty("expectedMsg1"));
		
		
		
		String articleText2= driver.findElement(By.xpath("(//span[@class='article-type']//following::h2)[5]")).getText();
		System.out.println(articleText2);
		
		Assert.assertEquals(articleText2, loadTestData.readTestData().getProperty("expectedMsg2"));
		
		String articleText3= driver.findElement(By.xpath("(//span[@class='article-type']//following::h2)[6]")).getText();
		System.out.println(articleText3);
		
		Assert.assertEquals(articleText3, loadTestData.readTestData().getProperty("expectedMsg3"));
		
		
		driver.close(); // Close the current browser.

	}
	// Second Scenarios
	
	@When("I select {string} from the hamburger menu")
	public void i_select_from_the_hamburger_menu(String string) {
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	PageLocators locatores = new PageLocators(driver);
	locatores.clickOnIUnderstandButton(); // click on I Understand button
	locatores.clickontheXIcon(); //Click on the 'X' Icon
	driver.findElement(By.xpath("//i[@class='btr bt-bars trigger']")).click(); // click on the Hamburger menu
	driver.findElement(By.xpath("(//a[text()='Contact us'])[1]")).click(); // Click on the Contact us link
	}
	
	
	@Then("I am taken to the {string} page")
	public void i_am_taken_to_the_page(String string) {
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  String actualTitle=driver.getTitle(); String
	 expectedTitle="Contact us - Digital Pulse"; 
	  assertEquals(actualTitle,expectedTitle); // verify the user is on the Contact Page.
	  
	  }
	
	@And("I am presented with the below options for contacts") 
	public void i_am_presented_with_the_below_options_for_contacts() throws InterruptedException {
		PageLocators locatores = new PageLocators(driver);
		Thread.sleep(3000);
		locatores.clickOnContactButton1();
		Thread.sleep(3000);
		 //driver.switchTo()
		//driver.switchTo().window("Experience Center");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		   ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs.get(1)); //switches to new t
		 String url  =driver.getCurrentUrl();
		 System.out.println(url);
		 Thread.sleep(3000);
		 Assert.assertEquals(url, loadTestData.readTestData().getProperty("experienceCenterUrl"));
		 
		 
		// driver.switchTo().window(tabs.get(1)); //switches to new t
		 Thread.sleep(3000);
		 driver.switchTo().window(tabs.get(0)); //switches to new t
		 locatores.clickOnContactButton2();
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(2)); //switches to new t
		 Thread.sleep(3000);
		 String careerUrl  =driver.getCurrentUrl();
		 System.out.println("CareerUrl  = " +careerUrl);
		 Assert.assertEquals(careerUrl, loadTestData.readTestData().getProperty("careersUrl"));
		 driver.switchTo().window(tabs2.get(0)); //switches to main window
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		 Thread.sleep(3000);
		 locatores.clickOnContactButton3();
		 ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs3.get(3)); //switches to new t
		 Thread.sleep(3000);
		 String enquiryUrl  =driver.getCurrentUrl();
		 System.out.println("EnquiriesUrl = " +enquiryUrl);
		 Assert.assertEquals(enquiryUrl, loadTestData.readTestData().getProperty("enquiriesUrl"));
		 driver.switchTo().window(tabs.get(0)); //switches to main window
		 driver.quit();
		 
		 }
	
	// Third Scenarios
	
	@When("I click on the {string} icon to perform a search")
	public void i_click_on_the_icon_to_perform_a_search(String string) {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		PageLocators locatores = new PageLocators(driver);
		locatores.clickOnIUnderstandButton(); // click on I Understand button
		locatores.clickontheXIcon(); //Click on the 'X' Icon
		locatores.clickOnSearchIcon();
		
	    
	}

	@When("I enter the text {string}")
	public void i_enter_the_text(String string) {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		PageLocators locatores = new PageLocators(driver);
		
		locatores.enterTextinSearchField(string);
		//locatores.enterTextinSearchField(loadTestData.readTestData().getProperty("enterSerchText"));
		    
	}

	@When("I submit the search")
	public void i_submit_the_search() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		PageLocators locatores = new PageLocators(driver);
		locatores.pressEnterKey();
	    
	}

	@Then("I am taken to the search results page")
	public void i_am_taken_to_the_search_results_page() {
	   String serachText= driver.findElement(By.xpath("(//span)[1]")).getText();
	   Assert.assertEquals(serachText, "Showing search results for");
	   
	}

	@Then("I am presented with at least {int} search result")
	public void i_am_presented_with_at_least_search_result(Integer int1) {
		
		  int noOfResult= driver.findElements(By.xpath("//h2/a")).size();
		  int intExpectedValues = int1.intValue();
		  Assert.assertTrue(noOfResult >= intExpectedValues);
		  
		  driver.quit();
		  
		
	    
	}
	
}


