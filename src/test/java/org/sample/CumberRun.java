package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CumberRun {
	WebDriver driver;
	@Given(":user is on adactin")
	public void user_is_on_adactin() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("http://adactinhotelapp.com/");
	 driver.manage().window().maximize();
	}
		
	@When(": user is going to enter {string} and {string}")
	public void user_is_going_to_enter_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
	
	}

	@When(":user should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then(": user shpould verify by seeing the home page")
	public void user_shpould_verify_by_seeing_the_home_page() {
		System.out.println("check by user");
	}

}
