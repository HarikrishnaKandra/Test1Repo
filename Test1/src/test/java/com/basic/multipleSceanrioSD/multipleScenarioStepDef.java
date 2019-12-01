package com.basic.multipleSceanrioSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class multipleScenarioStepDef {
	
	 WebDriver driver;
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page(){
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\chromedriver_win32_1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
	}
	public void Enter_the_Surname(){
		driver.findElement(By.xpath("//input[@id='q'")).sendKeys("HK");
	}

}
