package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dropdown");
		WebElement countrydropdown = driver.findElement(By.id("select3"));
		
		Select select = new Select(countrydropdown);
		select.selectByIndex(7);
		WebElement statedropdown = driver.findElement(By.id("select5"));
		
		Select state =new Select(statedropdown);
		state.selectByVisibleText("Uttar Pradesh");

	}

}
