package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceOptionDataPage extends BasePage {

	public @FindBy(xpath = "//table[@id='priceTable']/tfoot/tr/th[2]/label[4]/span") WebElement btn_price;
	public @FindBy(xpath = "//button[@id='nextsendquote']") WebElement btn_nextsendquote;

	public PriceOptionDataPage() throws IOException {
		super();

	}

	public PriceOptionDataPage user_select_Price() throws Exception {

		// Select Price
		basePage.waitAndClickElement(btn_price);

		// Select Next Button
		getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		basePage.waitAndClickElement(btn_nextsendquote);

		// Assert for Next Page

		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement displayInsurant = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(displayInsurant.isDisplayed());

		return new PriceOptionDataPage();

	}

}
