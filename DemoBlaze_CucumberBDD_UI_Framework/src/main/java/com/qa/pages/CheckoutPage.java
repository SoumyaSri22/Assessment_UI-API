package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.TestBase;

public class CheckoutPage extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement addtocartbtn;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addtocartclick()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		//addtocartbtn.click();
	}
	
	
	public void popuphandling() throws InterruptedException {
		
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
}
