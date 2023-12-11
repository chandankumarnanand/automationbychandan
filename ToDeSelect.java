package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDeSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/select-menu");

		WebElement carDropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(carDropdown);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select.selectByValue("volvo");
		
		Thread.sleep(2000);
		
		//select.deselectByIndex(3);
		
		//select.deselectByValue("volvo");
		Thread.sleep(2000);
		//select.deselectByValue("opel");
		
		
		
		//select.deselectAll();
		
		WebElement first = select.getFirstSelectedOption();
		System.out.println(first.getText());
		
		

	}

}
