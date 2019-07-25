package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverCommands_2 {

	public static void main(String[] args) {
		// Practice Exercise – 2
//		Launch a new IE browser.
//		Open http://demoqa.com/frames-and-windows/
//		Use this statement to click on a New Window button “driver.findElement(By.xpath(“.//*[@id=’tabs-1′]/div/p/a”)).click();”
//		Close the browser using close() command
		//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/tutorials/selenium-tutorials/");
		driver.findElement(By.xpath("//a[text()='A) Selenium Introduction']")).click();
		//driver.close();
		driver.quit();
		
	}

}
