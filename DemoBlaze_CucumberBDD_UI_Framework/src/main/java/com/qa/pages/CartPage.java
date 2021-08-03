package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.TestBase;

public class CartPage extends TestBase{

	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement cartLink;
	
	@FindBy(xpath="//a[contains(text(),'Delete')]")
	WebElement deletebtn;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOrderbtn;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void cartlink()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
	}
	
	public void deleteItemPresent() {
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).isDisplayed())
		
		{
			driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		}
		else
			System.out.print("Add items to proceed further");
	}
	public void checkCartEmpty() {
		if(driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).isDisplayed()) {
			System.out.print("Cart contains items");
			}
			else
				System.out.print("Add items to proceed further");
	}
	
	public void placebtn() {
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}
	
	public String verifyTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	public PlaceOrderPage placeOrder() {
		placeOrderbtn.click();
		return new PlaceOrderPage();
	}
	
}
