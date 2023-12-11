package PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	
	
		public registerpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
		@FindBy(id="name")
		private WebElement nameTextfield;
		
		
		@FindBy(id="email")
		private WebElement emailTextfield;
		
		
		@FindBy(id="password")
		private WebElement passwordTextfield;
		
		
		@FindBy(tagName="button")
		private WebElement registerbutton;
		
		
		
		
		public WebElement getNameTextfield() {
			return nameTextfield;
		}




		public void setNameTextfield(WebElement nameTextfield) {
			this.nameTextfield = nameTextfield;
		}




		public WebElement getEmailTextfield() {
			return emailTextfield;
		}



		public WebElement getPasswordTextfield() {
			return passwordTextfield;
		}



		public WebElement getRegisterbutton() {
			return registerbutton;
		}




		public void registerAction(String username,String password,String email) {
			nameTextfield.sendKeys("name");
			passwordTextfield.sendKeys("password");
			emailTextfield.sendKeys("email");
			registerbutton.click();
		}


}
