package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.TestBase;

public class SignUp extends TestBase{

	@FindBy(id="signin2")
	WebElement signinlink;
	
	@FindBy(id="sign-password")
	WebElement signinpass;
	
	@FindBy(id="sign-username")
	WebElement signinusername;
	
	
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
 
	public void signuplink()
	{
		driver.findElement(By.id("signin2")).click();
		
	}
	public void newusername()
	{
		driver.findElement(By.id("sign-username")).sendKeys("soumyanew");
		
	}
	public void newpassword() {
		driver.findElement(By.id("sign-password")).sendKeys("soumyatest");
	}
	
	public void signup() {
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
	}
	
	
	
	public void popupsignup() throws Exception {
		
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
