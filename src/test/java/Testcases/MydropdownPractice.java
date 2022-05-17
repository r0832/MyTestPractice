package Testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.ChekboxObjectModel;
import Resources.Baseclass;

public class MydropdownPractice extends Baseclass {
	
	@Test
	
	public void CheckboxPractice() {
		
		ChekboxObjectModel com = new ChekboxObjectModel(driver);
		
		com.Checkbox().size();
		
		for( WebElement b : com.Checkbox()) {
			
			b.click();
			
			
			
		}
		
		
	}

}
