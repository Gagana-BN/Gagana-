package Stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GaganTeng {
	static Logger log = Logger.getLogger(GaganTeng.class);
	WebDriver driver=null;
	@Test
    public void setUp()
    {
      System.out.println("Before Running....");
    }
	@Given("User is in login page")
	public void user_is_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\browserdriver\\chromedriver.exe\\chromedriver.exe");					
	  driver = new ChromeDriver();				
	       			
	       driver.get("https://demo.openmrs.org/openmrs/");
	       log.info("Open brower");
	       System.out.println("step1:user in login page"); 
	       log.debug("user is in login page");
	       Thread.sleep(10000);
	}
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		System.out.println("Username Entered");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		 log.debug("user name entered");
		 System.out.println("Password Entered");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
		  log.debug("password enterd");
		  driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();   
		  log.debug("clicked on Inpatient ward");
	}
		
		
		

	/*
	 * // @When("User enters {string} and {string}") // public void
	 * user_enters_and(String string, String string2) {
	 * 
	 * 
	 * System.out.println("Username Entered");
	 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(string);
	 * System.out.println("Password Entered");
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
	 * driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click(); }
	 */

	

	@And("User click on login")
	public void user_click_on_login() {
	  System.out.println("step3:cliked on login button"); 
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  log.debug("clicked on login button");
	}

	@Then("user Navigated to home page")
	public void user_navigated_to_home_page() throws InterruptedException {
		System.out.println("step4:user is in home page");
		driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click(); 
		Thread.sleep(8000);
		log.debug("user is in home page");
	}
	@And("user enters paients name")
	public void user_enters_paients_name() throws InterruptedException {
		System.out.println("step5:user enters paients name");
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[1]/div[1]/p[1]/input[1]")).sendKeys("Gagana");    
		log.debug("first name entered");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[1]/div[1]/p[2]/input[1]")).sendKeys("B");
		Thread.sleep(4000);
		log.debug("middle name entered");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/section[1]/div[1]/fieldset[1]/div[1]/p[3]/input[1]")).sendKeys("N");
		log.debug("last name entered");
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]
		log.debug("clicked on next button");
	}

	@Then("user selects patients gender")
	public void user_selects_patients_gender() {
		System.out.println("step6:user selects patients gender");
		driver.findElement(By.xpath("//option[@value='M']")).click(); 
		log.debug("gender is selected");
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		log.debug("clicked on next button");
	}

	@Then("user enters patient Age")
	public void user_enters_patient_age() {
		System.out.println("step7:user enters patient Age");
		driver.findElement(By.xpath("//input[@id='birthdateYears-field' and @name='birthdateYears']")).sendKeys("22");
		log.debug("age is entered");
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		log.debug("clicked on next button");
	}

	@And("user enters patients address")
	public void user_enters_patients_address() throws InterruptedException {
		System.out.println("step8:user enters patients address");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Address1");
		log.debug("Address field 1 is filled");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Address2");
		log.debug("Address field 2 is filled");
		driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys("Belur");
		log.debug("cityVillage field is filled");
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("Karnataka");
		log.debug("stateProvince field is filled");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		log.debug("country field is filled");
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("573215");
		log.debug("pincode field is filled");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		log.debug("clicked on next button");
	}

	@When("user registers the patient")
	public void user_registers_the_patient() throws InterruptedException {
		System.out.println("step9:user registers the patient");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9902109662"); 
		log.debug("entered phone number");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/div[@id='nav-buttons']/button[@id='next-button']/icon[1]")).click();
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		log.debug("clicked on next button");
		//input[@id='submit']
	}

	@Then("user clicks on logout")
	public void user_clicks_on_logout() throws InterruptedException {
		System.out.println("step10:user clicks on logout");
		Thread.sleep(40000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/ul[1]/li[3]")).click();   
		log.debug("clicked on logout button");
	}
	@After
    public void tearDown()
    {
      System.out.println("After Method Running....");
    }
////input[@id='fr4691-field']
}


