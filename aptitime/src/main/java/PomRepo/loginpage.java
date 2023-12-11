package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
		public loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
		@FindBy(tagName="h1")
		private WebElement loginhadder;
		
		@FindBy(id="email")
		private WebElement emailTextfield;
		
		
		@FindBy(id="password")
		private  WebElement passwordTextfield;
		
		
		@FindBy(tagName="button")
		private WebElement loginTextfield;
		
		@FindBy(xpath="//div[text()='Signin successful']")
		private WebElement loginSuceesfuldisplay;
		
		
		
		
		public WebElement getLoginhadder() {
			return loginhadder;
		}





		public WebElement getEmailTextfield() {
			return emailTextfield;
		}





		public WebElement getPasswordTextfield() {
			return passwordTextfield;
		}



		public void setPasswordTextfield(WebElement passwordTextfield) {
			this.passwordTextfield = passwordTextfield;
		}



		public WebElement getLoginTextfield() {
			return loginTextfield;
		}







		public WebElement getLoginSuceesfuldisplay() {
			return loginSuceesfuldisplay;
		}




		public void LoginAction(String username,String password) {
			emailTextfield.sendKeys(username);
			passwordTextfield.sendKeys(password);
			loginTextfield.click();
		}
        public String verifyLoginPage() {
        	return loginhadder.getText();
        }
        public boolean loginSucessmsgDisplay() {
        	return loginSuceesfuldisplay.isDisplayed();
        }

}
