package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage extends BasePage {
	public @FindBy(xpath = "//select[@id='make']") WebElement combo_make;
	public @FindBy(xpath = "//select[@id='model']") WebElement combo_model;
	public @FindBy(xpath = "//input[@id='cylindercapacity']") WebElement textfield_cylindercapacity;
	public @FindBy(xpath = "//input[@id='engineperformance']") WebElement textfield_engineperformance;
	public @FindBy(css = "#opendateofmanufacturecalender > .fa") WebElement btn_open_calender;
	public @FindBy(linkText = "1") WebElement btn_select_date;
	public @FindBy(xpath = "//select[@id='numberofseats']") WebElement combo_numberofseats;
	public @FindBy(xpath = "//label/span") WebElement btn_hand;
	public @FindBy(xpath = "//select[@id='fuel']") WebElement combo_fuel;
	public @FindBy(xpath = "//input[@id='payload']") WebElement textfield_payload;
	public @FindBy(xpath = "//input[@id='totalweight']") WebElement textfield_totalweight;
	public @FindBy(xpath = "//input[@id='listprice']") WebElement textfield_listprice;
	public @FindBy(xpath = "//input[@id='licenseplatenumber']") WebElement textfield_licenseplatenumber;
	public @FindBy(xpath = "//input[@id='annualmileage']") WebElement textfield_annualmileage;
	public @FindBy(xpath = "//button[@id='nextenterinsurantdata']") WebElement btn_nextenterinsurantdata;
	public String data;

	public VehicleDataPage() throws IOException {
		super();

	}

	public VehicleDataPage user_navigates_to_tricentis_vehicle_insurance_application() throws IOException {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
		// Thread.sleep(6000);
		return new VehicleDataPage();

	}

	public VehicleDataPage user_fill_the_form_with_valid_data() throws Exception {

		// Select Make
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObject = new Select(driver.findElement(By.xpath("//select[@id='make']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObject.selectByValue("Ford");

		// Select Make
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectModel = new Select(driver.findElement(By.xpath("//select[@id='model']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectModel.selectByValue("Motorcycle");

		// Enter Engine Performace
		basePage.sendKeysToWebElement(textfield_engineperformance, RandomStringUtils.randomNumeric(3));

		// Enter Cylinder Capacity
		basePage.sendKeysToWebElement(textfield_cylindercapacity, RandomStringUtils.randomNumeric(3));

		// Select Date
		basePage.clickOnElementUsingCustomTimeout(btn_open_calender, getDriver(), 60);
		basePage.clickOnElementUsingCustomTimeout(btn_select_date, getDriver(), 60);

		// Select Seats
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectSeats = new Select(driver.findElement(By.xpath("//select[@id='numberofseatsmotorcycle']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectSeats.selectByValue("1");

		// Select hand
		basePage.waitAndClickElement(btn_hand);

		// Select Seats_2
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectSeats2 = new Select(driver.findElement(By.xpath("//select[@id='numberofseats']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectSeats2.selectByValue("1");

		// Select Fuel Type
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectFuelType = new Select(driver.findElement(By.xpath("//select[@id='fuel']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectFuelType.selectByValue("Petrol");

		// Enter Payload
		basePage.sendKeysToWebElement(textfield_payload, RandomStringUtils.randomNumeric(3));

		// Enter Total Weight
		basePage.sendKeysToWebElement(textfield_totalweight, RandomStringUtils.randomNumeric(3));

		// Enter List Price
		basePage.sendKeysToWebElement(textfield_listprice, RandomStringUtils.randomNumeric(5));

		// Enter License Plate Number
		basePage.sendKeysToWebElement(textfield_licenseplatenumber, RandomStringUtils.randomNumeric(3));

		// Enter Annual Mileage
		basePage.sendKeysToWebElement(textfield_annualmileage, RandomStringUtils.randomNumeric(4));
		
		return new VehicleDataPage();

	}
	
	  public VehicleDataPage user_clicks_on_the_next_button() throws Exception {
		  
			// Select Next Button
		  getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		  basePage.waitAndClickElement(btn_nextenterinsurantdata);
		  return new VehicleDataPage();

	  
	  }
	  
	    // Assert for Next Page
	  public VehicleDataPage insurant_data_form_is_displayed() throws Exception {
			getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			WebElement displayInsurant = driver.findElement(By.xpath("//input[@id='firstname']"));
			Assert.assertTrue(displayInsurant.isDisplayed());
			return new VehicleDataPage();	
	  }
	 

}
