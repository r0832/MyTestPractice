package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChekboxObjectModel {
	public WebDriver driver;
	
	private By checkBox = By.xpath("/input[@type='checkbox']");
	
	
	
	public ChekboxObjectModel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}



	public List<WebElement> Checkbox() {			
		return driver.findElements(checkBox);						
	}
	

}
