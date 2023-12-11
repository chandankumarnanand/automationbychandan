package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMultipleOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/select-menu");

		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carDropdown);
		
		
		select.selectByVisibleText("Audi");
		
		
		select.selectByValue("volvo");
	List<WebElement> allSelected = select.getAllSelectedOptions();
	int noOfSelectedOption = allSelected.size();
	
	System.out.println( noOfSelectedOption );
	
	for(WebElement selectedOption:allSelected) {
		System.out.println( selectedOption.getText());
	}

	}

}
