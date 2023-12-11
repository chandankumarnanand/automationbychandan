package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySelectedOptions {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/select-menu");

		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carDropdown);
		
		select.selectByVisibleText("Audi");
		
		
		
		select.selectByVisibleText("Volvo");
		
	//List<WebElement> selectoption = select.getAllSelectedOptions();
	//int noOfSelectedOption = selectoption.size();
	//System.out.println("the no of selected options are : "+noOfSelectedOption);
	
	//for(WebElement option: selectoption) {
		//System.out.println(option.getText());
//	}
	//WebElement firstselect = select.getFirstSelectedOption();
//	String firstselectoption = firstselect.getText();
	//System.out.println( "the first select option is:" +firstselectoption);

		

	}

}
