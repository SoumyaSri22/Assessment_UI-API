package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utilities.TestBase;

public class LoginPage extends TestBase{

	public static WebDriver wd;
	public static WebDriverWait wait;
	
	@FindBy(id="login2")
	static
	WebElement LogInLink;
	
	@FindBy(name="loginusername")
	static
	WebElement username;
	
	@FindBy(name="loginpassword")
	static
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	static
	WebElement LogInBtn;
	
	//initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public static String validateLoginPageTitle() {
		return driver.getTitle();	
	}
	
	public static void clicklogin() {
		driver.findElement(By.id("login2")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(LogInLink)).click();
	}
	public static void enterusername() {
		driver.findElement(By.id("loginusername")).sendKeys("soumyatest");
	}
	
	public static void invalidusername() {
		driver.findElement(By.id("loginusername")).sendKeys("soumya");
	}
	public static void enterpassword() {
		driver.findElement(By.id("loginpassword")).sendKeys("soumya");
	}
	
	public static void invalidpassword() {
		driver.findElement(By.id("loginpassword")).sendKeys("soumyatest");
	}

	public static void clickloginbtn() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
   public static void login(String un , String pwd) {
	   
		username.sendKeys(un);
		password.sendKeys(pwd);
	   //login.click();
	   //JavascriptExecutor js= (JavascriptExecutor) driver;
	    //js.executeScript("arguments[]0.click();", LogInBtn);
	    
   }
   
}