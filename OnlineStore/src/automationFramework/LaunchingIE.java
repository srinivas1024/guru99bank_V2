package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchingIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
        driver.close();
	    
//	    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer(); 
//	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
//	    capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//	    System.out.println("Starting InternetExplorer........"); 
//	    System.setProperty("webdriver.ie.driver","D:\\\\Selenium\\\\SeleniumDownloads\\\\drivers\\\\IEDriverServer_x64_3.141.59\\\\IEDriverServer.exe");    
//	   // WebDriver driver = new InternetExplorerDriver();
//	    InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
//	    driver.manage().window().maximize(); 
//	    driver.get("http:toolsqa.com/automation-practice-form/");
//	    driver.close();

	}

}
