package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author SRINIVAS
 *Scenario to Automate
	Launch the Firefox browser
	Open website “www.Store.DemoQA.com”
	Print a Message to display that the website is opened successfully
	Wait for 5 Seconds
	Close the Browser
 */
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
	 // Create a new instance of the Firefox driver
		
		//selenium 2.53 and firefox 43 is  working
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		//selenium 2.53 and firefox latest is not working
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
		        //Launch the Online Store Website
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
		 //Wait for 5 Sec
		 Thread.sleep(5000);
		 
		        // Close the driver
		        driver.quit();

	}

}
