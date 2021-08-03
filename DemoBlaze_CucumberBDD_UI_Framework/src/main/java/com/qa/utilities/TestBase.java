package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop=new Properties();
			FileInputStream fi= new FileInputStream("C:\\Automation\\Cucumber_Workspace"
					+ "\\DemoBlaze_CucumberBDD_UI_Framework\\confiq.properties");
			prop.load(fi);
			
		}catch (IOException e) {
			e.getMessage();
		}
	}
	
	
	public static void initialisation()
	{
		String browserName= prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			//String driverPath= "./Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
		else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
		else if (browserName.equals("edge")) {
		
		System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
}}
	public static void close_Browser() {
		
		driver.close();
	}
}
