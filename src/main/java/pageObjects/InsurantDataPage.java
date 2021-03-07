package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage extends BasePage {

	public @FindBy(xpath = "//input[@id='firstname']") WebElement textfield_name;
	public @FindBy(xpath = "//input[@id='lastname']") WebElement textfield_lastname;
	public @FindBy(css = "#opendateofbirthcalender > .fa") WebElement btn_open_calender_birth;
	public @FindBy(xpath = "//input[@id='birthdate']") WebElement textfield_birthdate;
	public @FindBy(xpath = "//form[@id='insurance-form']/div/section[2]/div[4]/p/label/span") WebElement btn_gender;
	public @FindBy(xpath = "//input[@id='streetaddress']") WebElement textfield_streetaddress;
	public @FindBy(xpath = "//input[@id='zipcode']") WebElement textfield_zipcode;
	public @FindBy(xpath = "//input[@id='city']") WebElement textfield_city;
	public @FindBy(xpath = "//label[3]/span") WebElement btn_hobbies;
	public @FindBy(xpath = "//input[@id='website']") WebElement textfield_website;
	public @FindBy(xpath = "//button[@id='nextenterproductdata']") WebElement btn_nextenterproductdata;
	

	public InsurantDataPage() throws IOException {
		super();

	}

	public InsurantDataPage user_fill_the_insurant_form_with_valid_data() throws Exception {

		// Enter First Name
		basePage.sendKeysToWebElement(textfield_name, RandomStringUtils.randomAlphabetic(6));

		// Enter The Last Name
		basePage.sendKeysToWebElement(textfield_lastname, RandomStringUtils.randomAlphabetic(5));

		// Enter Date Birth
		basePage.clickOnElementUsingCustomTimeout(btn_open_calender_birth, getDriver(), 60);
		basePage.sendKeysToWebElement(textfield_birthdate, "07/10/1983");
		
		// Enter Street Address
				basePage.sendKeysToWebElement(textfield_streetaddress, RandomStringUtils.randomAlphabetic(6));

		// Enter Gender
		basePage.waitAndClickElement(btn_gender);

		// Select Country
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectCountry.selectByValue("Latvia");

		// Enter Zip Code
		basePage.sendKeysToWebElement(textfield_zipcode, RandomStringUtils.randomNumeric(4));

		// Enter City
		basePage.sendKeysToWebElement(textfield_city, RandomStringUtils.randomAlphabetic(6));

		// Select Occupation

		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectOccupation = new Select(driver.findElement(By.xpath("//select[@id='occupation']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectOccupation.selectByValue("Employee");

		// Enter Hobbies
		basePage.waitAndClickElement(btn_hobbies);
		
		// Enter Website
		
		basePage.sendKeysToWebElement(textfield_website, "www.igor.com");
		
		//Click Next Button
		basePage.waitAndClickElement(btn_nextenterproductdata);
		
		return new InsurantDataPage();

	}

}
