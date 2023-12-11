
package genricUtils;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	
		String browser="chrome";
		String url="https://demoapps.qspiders.com/login?scenario=1";
		
		@BeforeClass
		public void bc() throws IOException {
			
	 String browser  =fUtils.toFetchDataFromPropertyFile("browser");
	 String url= fUtils.toFetchDataFromPropertyFile("url");
			
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
					
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.get(url);
		
		
	
	
	

}
		@AfterClass
		public void ac() {
			driver.quit();
		}

		
	}

