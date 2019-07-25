package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-form/");
       driver.close();

	}

}
