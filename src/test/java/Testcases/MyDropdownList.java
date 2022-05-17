package Testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.DropdownList;
import Resources.Baseclass;

public class MyDropdownList extends Baseclass {
	@Test
	public void DropDownSelect() {
		
		DropdownList ddl = new DropdownList(driver);

		
		for(WebElement c : ddl.Dropdownlist()) {
			c.click();
			
		}
		
		
	}
	
	

}
