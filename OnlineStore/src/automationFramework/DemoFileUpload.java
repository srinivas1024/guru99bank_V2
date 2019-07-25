package automationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFileUpload {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\SeleniumDownloads\\drivers\\chromedriver_win32_2.45\\chromedriver.exe" );
		
		
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
       //WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Selenium/fileupload.html");
        driver.findElement(By.xpath("//input[@type='file']")).click();
        Runtime.getRuntime().exec("D:\\Selenium\\FileuploadScript.exe");

	}

}
