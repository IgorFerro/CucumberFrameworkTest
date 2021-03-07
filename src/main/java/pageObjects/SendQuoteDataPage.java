package pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendQuoteDataPage extends BasePage {

	public @FindBy(xpath = "//input[@id='email']") WebElement textfield_email;
	public @FindBy(xpath = "//input[@id='phone']") WebElement textfield_phone;
	public @FindBy(xpath = "//input[@id='username']") WebElement textfield_username;
	public @FindBy(xpath = "//input[@id='password']") WebElement textfield_password;
	public @FindBy(xpath = "//input[@id='confirmpassword']") WebElement textfield_confirmpassword;
	public @FindBy(xpath = "//textarea[@id='Comments']") WebElement textfield_comments;
	public @FindBy(xpath = "//button[contains(.,'« Send »')]") WebElement btn_send;

	public SendQuoteDataPage() throws IOException {
		super();
	}

	public SendQuoteDataPage user_send_Quotes() throws Exception {

		// Enter Email
		basePage.sendKeysToWebElement(textfield_email, RandomStringUtils.randomNumeric(4) + "@gmail.com");

		// Enter Phone
		basePage.sendKeysToWebElement(textfield_phone, RandomStringUtils.randomNumeric(9));

		// Enter User Name
		basePage.sendKeysToWebElement(textfield_username, RandomStringUtils.randomAlphabetic(8));

		// Enter Password
		basePage.sendKeysToWebElement(textfield_password, "Test01$");

		// Enter Confirm Password
		basePage.sendKeysToWebElement(textfield_confirmpassword, "Test01$");

		// Enter Comments
		basePage.sendKeysToWebElement(textfield_comments, RandomStringUtils.randomAlphabetic(15));
		
		// Click on Send Email button
		  getDriver().manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		  basePage.waitAndClickElement(btn_send);
		

		return new SendQuoteDataPage();

	}

}
