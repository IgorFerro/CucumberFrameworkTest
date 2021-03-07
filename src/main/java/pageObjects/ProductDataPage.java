package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage extends BasePage {

	public @FindBy(css = "#openstartdatecalender > .fa") WebElement btn_openstartdatecalender;
	public @FindBy(xpath = "//input[@id='startdate']") WebElement textfield_startdate;
	public @FindBy(xpath = "//div[5]/p/label/span") WebElement btn_OptionalProducts;
	public @FindBy(xpath = "//form[@id='insurance-form']/div/section[3]") WebElement btn_insurancesum;
	public @FindBy(xpath = "//button[@id='nextselectpriceoption']") WebElement btn_nextselectpriceoption;

	public ProductDataPage() throws IOException {
		super();

	}

	public ProductDataPage user_fill_the_Product_form_with_valid_data() throws Exception {

		// Select Star Date
		basePage.clickOnElementUsingCustomTimeout(btn_openstartdatecalender, getDriver(), 60);
		basePage.sendKeysToWebElement(textfield_startdate, "05/05/2021");

		// Select Optional Products
		basePage.waitAndClickElement(btn_OptionalProducts);

		// Select Merit Rating
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectMeritRating = new Select(driver.findElement(By.xpath("//select[@id='meritrating']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectMeritRating.selectByValue("Super Bonus");

		// Select Damage Insurance
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectDamageInsurance = new Select(
				driver.findElement(By.xpath("//select[@id='damageinsurance']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectDamageInsurance.selectByValue("Full Coverage");

		// Select Damage Insurance
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectCourtesyCar = new Select(driver.findElement(By.xpath("//select[@id='courtesycar']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectCourtesyCar.selectByValue("Yes");

		// Select Insurance Sum
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		Select selectObjectInsuranceSum = new Select(driver.findElement(By.xpath("//select[@id='insurancesum']")));
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		selectObjectInsuranceSum.selectByIndex(2);

		// Select Next Button
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		basePage.waitAndClickElement(btn_nextselectpriceoption);

		// Assert for Next Page Undefined Insurance
		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement displayInsurant = driver.findElement(By.xpath("//a[@id='selectpriceoption']"));
		Assert.assertTrue(displayInsurant.isDisplayed());

		return new ProductDataPage();
	}
}
