package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccesfullyDataPage extends BasePage {
	
	public @FindBy(xpath = "//button[contains(.,'OK')]") WebElement btn_ok;

	public SuccesfullyDataPage() throws IOException {
		super();
	
	}
	
	public SuccesfullyDataPage insurance_data_was_successfully_sent() throws Exception {
		
		// Assert for Next Page
		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement displaySuccess = driver.findElement(By.xpath("//h2[contains(.,'Sending e-mail success!')]"));
		Assert.assertTrue(displaySuccess.isDisplayed());
		
		// Click OK Button
		basePage.waitAndClickElement(btn_ok);
		
		
		
		return new SuccesfullyDataPage();
		
		
	}
	
	

}
