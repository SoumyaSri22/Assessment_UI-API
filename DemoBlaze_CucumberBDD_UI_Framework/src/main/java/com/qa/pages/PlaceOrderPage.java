package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.TestBase;

public class PlaceOrderPage extends TestBase{
	
@FindBy(xpath="//input[@id='name']")
WebElement namelink;

@FindBy(xpath="//input[@id='country']")
WebElement countrylink;

@FindBy(xpath="//input[@id='city']")
WebElement citylink;

@FindBy(xpath="//input[@id='card']")
WebElement cardlink;

@FindBy(xpath="//input[@id='month']")
WebElement monthlink;

@FindBy(xpath="//input[@id='year']")
WebElement yearlink;
	
@FindBy(xpath="//button[contains(text(),'Purchase')]")
WebElement purchasebtn;

public PlaceOrderPage() {
	PageFactory.initElements(driver, this);
}

public void placeorderlink() {
	driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
}

public void purchasedetails() 
{
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Soumya");
	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Lucknow");
	driver.findElement(By.xpath("//input[@id='card']")).sendKeys("4260234533335555");
	driver.findElement(By.xpath("//input[@id='month']")).sendKeys("07");
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2021");
	driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
}

public void okclick() throws InterruptedException {
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
}

public void nodetails() {
	purchasebtn.click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	System.out.print("Enter all details to proceed");
	alert.accept();
}
public void orderConfirmationpopup() {
	
	//purchasebtn.click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
}

}
