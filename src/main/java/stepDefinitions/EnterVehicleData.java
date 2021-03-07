package stepDefinitions;

import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.InsurantDataPage;
import pageObjects.VehicleDataPage;
import utils.DriverFactory;

public class EnterVehicleData extends DriverFactory {
	
	public String data;
	
	@Given("^User navigates to tricentis vehicle insurance application$")
	public void user_navigates_to_tricentis_vehicle_insurance_application() throws Throwable {
		getDriver().get("http://sampleapp.tricentis.com/101/app.php");
		
	}

	@And("^User fill the form with valid data$")
	public void user_fill_the_form_with_valid_data() throws Throwable {
		vehicleDataPage.user_fill_the_form_with_valid_data();
		
	}

	@When("^User clicks on the next button$")
	public void user_clicks_on_the_next_button() throws Throwable {
		vehicleDataPage.user_clicks_on_the_next_button();
	   
	}

	@Then("^Insurant data form is displayed$")
	public void insurant_data_form_is_displayed() throws Throwable {
		vehicleDataPage.insurant_data_form_is_displayed();
	   
	}
	
	@And("^User fill the Insurant form with valid data$")
	public void user_fill_the_Insurant_form_with_valid_data() throws Throwable {
	     insurantDataPage.user_fill_the_insurant_form_with_valid_data();
	}
	
	@And("^User fill the Product form with valid data$")
	public void user_fill_the_Product_form_with_valid_data() throws Throwable {
		productDataPage.user_fill_the_Product_form_with_valid_data();
	   
	}
	
	@And("^User select Price$")
	public void user_select_Price() throws Throwable {
		priceOptionDataPage.user_select_Price();
	
	}
	
	@And("^User send Quotes$")
	public void user_send_Quotes() throws Throwable {
		sendQuoteDataPage.user_send_Quotes();
	    
	}
	
	@Then("^Insurance data was successfully sent$")
	public void insurance_data_was_successfully_sent() throws Throwable {
		 successfullyDataPage.insurance_data_was_successfully_sent();
	}

}
