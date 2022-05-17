package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownList {
public WebDriver driver;

private By dropdownList = By.xpath("//select[@id='dropdown-class-example']");

public DropdownList(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver = driver2;
	
}

public List<WebElement> Dropdownlist() {
	return driver.findElements(dropdownList);
	
}

}
