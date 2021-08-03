package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutusPage {

	@FindBy(xpath="//a[contains(text(),'About us')]")
	WebElement aboutUslink;
	
	
	
	
}
