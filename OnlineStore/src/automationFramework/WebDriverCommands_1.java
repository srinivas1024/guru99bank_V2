package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_1 {

	/**
	 * Practice Exercise – 1
//		Launch a new chrome browser.
//		Open Store.DemoQA.com
//		Get Page Title name and Title length
//		Print Page Title and Title length on the Eclipse Console.
//		Get Page URL and verify if the it is a correct page opened
//		Get Page Source (HTML Source code) and Page Source length
//		Print Page Length on Eclipse Console.
//		Close the Browser
	 */
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        String Title=driver.getTitle();
        int titlelength=Title.length();
        System.out.println("Page title is..."+" "+Title);
        System.out.println("Title length is..."+" "+titlelength);
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://demoqa.com/";
        if(actualurl.equalsIgnoreCase(expectedurl))
        {
        	System.out.println("correct page is opened"+" "+actualurl+"="+expectedurl);
        }
        else
        {
        	System.out.println("correct page is not opened"+" "+actualurl+"!="+expectedurl);
        }
        String pagesource=driver.getPageSource();
        System.out.println("Page source is...");
        System.out.println(pagesource);
        
        int pagesourcelength=pagesource.length();
        System.out.println("page source length is ...."+pagesourcelength);
        
        driver.close();
        

	}

}
