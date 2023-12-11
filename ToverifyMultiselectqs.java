package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToverifyMultiselectqs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://demoapps.qspiders.com/dropdown/multiSelect");
				WebElement countrydropdownmulti = driver.findElement(By.id("mul"));
				Select select = new Select(countrydropdownmulti);
			boolean multi = select.isMultiple();
			if(multi) {
				System.out.println("pass: the dropdown is multiselected");
			}
			else
				System.out.println("fail the  dropdown is not multiselected ");

	}

}
