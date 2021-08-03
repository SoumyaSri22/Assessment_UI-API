package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Homelink;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement ContactUslink;
	
	@FindBy(xpath="//a[contains(text(),'About us')]")
	WebElement Aboutuslink;
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement Cartlink;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement LogInlink;
	
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement Signuplink;
	
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	WebElement phoneCategory;
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	WebElement laptopsCategory;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	WebElement monitorsCategory;
	
	@FindBy(xpath="//button[contains(text(),'Previous')]")
	WebElement previousbtn;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nextbtn;
	
	@FindBy(xpath="//a[contains(text(),'soumyatest')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement firstitemphones;
	
	@FindBy(xpath="//a[contains(text(),'Sony vaio i5')]")
	WebElement firstitemlaptops;
	
	@FindBy(xpath="//a[contains(text(),'Apple monitor 24')]")
	WebElement firstitemmonitor;
	
	
	//Initializing the page objects
	
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }

    public String HomePagetitle() {
    	return driver.getTitle();
    }
    
    
    public boolean correctUserName() {
    	return userNameLabel.isDisplayed();
    }
    
    public void addphoneitem() {
    	firstitemphones.click();
    	
    }
    
    public void addlaptopitem() {
    	driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
    	driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
    }
    
    public void addmonitoritem() {
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
    	driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]")).click();
    
    }
    
    public void clickContactlink() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		Thread.sleep(1000);
    }
    
    public void clickCartlink() throws InterruptedException {
    	driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		Thread.sleep(1000);
    }
    
    public void clickLogoutlink() throws InterruptedException {
    	driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(1000);
    }
    public void clickprevandnext() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Previous')]")).click();
		Thread.sleep(1000);
    }
    public static boolean checklogouttext() {
    	
    	if(driver.getPageSource().contains("Log out"))
    		return true;
    	else 
    		return false;
    }
    
}
