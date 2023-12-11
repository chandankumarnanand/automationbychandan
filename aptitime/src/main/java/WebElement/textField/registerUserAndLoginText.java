package WebElement.textField;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PomRepo.loginpage;
import PomRepo.registerpage;
import genricUtils.BaseClass;

public class registerUserAndLoginText extends BaseClass {
	
	WebDriver driver;
	@Test(priority=1)
	public void registerUserAndVerify() throws EncryptedDocumentException, IOException {
		String name = fUtils.fetchStringDataFromExcelSheet("Register", 1, 0);
	String email = fUtils.fetchStringDataFromExcelSheet("Register", 1, 1);
		String password = fUtils.fetchStringDataFromExcelSheet("Register", 1, 2);
		String expectedLoginPageContentext = fUtils.fetchStringDataFromExcelSheet("Register", 1, 3);
		
		registerpage register = new registerpage(driver);
		register.registerAction(name,email ,password);
		
	loginpage login = new loginpage(driver);
	login.LoginAction(name, password);
	
		
	}
	@Test(priority=2)
	public void loginUserAndVerify() throws EncryptedDocumentException, IOException {
		
		String name = fUtils.fetchStringDataFromExcelSheet("Register", 1, 0);
		String email = fUtils.fetchStringDataFromExcelSheet("Register", 1, 1);
	   boolean expectedLoginInformation = fUtils.fetchBooleanDataFromExcelSheet("Login", 1, 2);
	
	       loginpage login = new loginpage(driver);
	       
	       login.LoginAction(name, email);
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
	      wait.until(ExpectedConditions.elementToBeClickable(login.getLoginhadder()));
	      
	     boolean actualloginStatus = login.loginSucessmsgDisplay();
	     
	    
	    Assert.assertEquals(expectedLoginInformation, actualloginStatus);
	    System.out.println("pass:the user login");
	
	
		
	}

}
