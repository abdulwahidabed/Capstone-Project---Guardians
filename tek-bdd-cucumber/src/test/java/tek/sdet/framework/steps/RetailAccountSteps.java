package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {

    POMFactory pomFactory = new POMFactory();
    
    @When("User clicks on Account option")
    public void userClickOnAccountOption() {
    	click(pomFactory.retailAccountPage().accountLink);
    	logger.info("Account link was clicked sucessfully");
    }
    @When("User Update Name {String} and Phone {String}")
    public void userUpdateNameAndPhone(String name, String phoneNumber) {
    	
    	clearTextUsingSendKeys (pomFactory.retailAccountPage().nameField);
    	sendText(pomFactory.retailAccountPage().nameField, name);
    	logger.info("Name was entered sucessfully");
    	clearTextUsingSendKeys (pomFactory.retailAccountPage().Phonefield);
    	sendText(pomFactory.retailAccountPage().Phonefield, phoneNumber);
    	logger.info("Phone Number was entered sucessfully");
    }
    @When("User click on update button")
    public void userClickOnUpdateButton() {
    	click(pomFactory.retailAccountPage().updateBttn);
    	logger.info("User button was clicked sucessfully");
    }
    @When("User profile information shoould be update")
    public void userProfileInformationShouldBeUpdate() {
    	waitTillPresence(pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg);
    	String expectedMssg = "Personal Information updated Sucessfully";
    	String actualMssg= pomFactory.retailAccountPage().personalInfoUpdateSuccessMssg.getText();
    	Assert.assertEquals(expectedMssg, actualMssg);
    	logger.info("Account information was updated successsfully");
    }
    @When("User click on Add a payment Method")
    public void userClickOnAddAPaymentMethod() {
    	click(pomFactory.retailAccountPage().addAPaymentMethodLink);
    	logger.info("Add Payment Method was clicked Successfully");
    }
    @When("User fill debit or Credit card information")
    public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
    	List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
    	sendText(pomFactory.retailAccountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
    	sendText(pomFactory.retailAccountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
    	selectByVisibleText(pomFactory.retailAccountPage().expirationMonthField, paymentInfo.get(0).get("expirationMonth"));
    	selectByVisibleText(pomFactory.retailAccountPage().expirationYearField, paymentInfo.get(0).get("expirationYear"));
    	sendText(pomFactory.retailAccountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
    	logger.info("Payment Information was entered Successfully");
    }
    @When("User clicked on Add your card button")
    public void userClickedOnAddYourCardButton() {
    	click(pomFactory.retailAccountPage().paymentSubmitBtn);
    	logger.info("Payment Method Submit Bttn clicked succesfully");
    }
    @Then("a message should be displayed {String}")
    public void aMessageShouldBeDisplayed(String expectedMssg) {
    	
    	if(expectedMssg.contains("Payment Method Added")) {
    		waitTillPresence(pomFactory.retailAccountPage().paymentMethodSuccessMssg);
    		Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().paymentMethodSuccessMssg.getText());
    		logger.info("Expected Message:" + expectedMssg);
    	}else if (expectedMssg.contains("Address Added")) {
    	    	waitTillPresence(pomFactory.retailAccountPage().addressSuccessMssg);
    	    	Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().addressSuccessMssg.getText());
    	    	logger.info("Expected Message:" + expectedMssg);
    	}else if (expectedMssg.contains("order Placed")) {
	    	waitTillPresence(pomFactory.retailAccountPage().orderPlacedSuccessfullyMssg);
	    	Assert.assertEquals(expectedMssg, pomFactory.retailAccountPage().orderPlacedSuccessfullyMssg.getText());
	    	logger.info("Expected Message:" + expectedMssg);
    	    }
    	}
    @When("User Click on Add Address Option")
    public void userClickOnAddAddressOption() {
        click(pomFactory.retailAccountPage().addAddressLink);
        logger.info("Add Address Link was clicked successfully");
    }
    @When("user fill new address form with below information")
    public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
        List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);

        selectByVisibleText(pomFactory.retailAccountPage().AddressCountryDropdown,
                DataGenerator.addressGenerator(addressInfo.get(0).get("country")));
        sendText(pomFactory.retailAccountPage().addressNameField, 
        		DataGenerator.addressGenerator(addressInfo.get(0).get("fullName")));
        sendText(pomFactory.retailAccountPage().addressPhoneField, 
        		DataGenerator.addressGenerator(addressInfo.get(0).get("phoneNumber")));
        sendText(pomFactory.retailAccountPage().addressStreetField, 
        		DataGenerator.addressGenerator(addressInfo.get(0).get("streetAddress")));
        sendText(pomFactory.retailAccountPage().addressApartmentnum, 
        		DataGenerator.addressGenerator(addressInfo.get(0).get("apt")));
        sendText(pomFactory.retailAccountPage().addressCityField, 
        		DataGenerator.addressGenerator(addressInfo.get(0).get("city")));
     selectByVisibleText(pomFactory.retailAccountPage().addressStateDropdown,
                DataGenerator.addressGenerator(addressInfo.get(0).get("state")));
        sendText(pomFactory.retailAccountPage().addressZipCodeField, addressInfo.get(0).get("zipCode"));
        logger.info("Address form was filled out successfully");
    }
    @When("user click Add Your Address button")
    public void userClickAddYourAddressButton() {
        click(pomFactory.retailAccountPage().addressAddBttn);
        logger.info("Add Your Address Button was clicked successfully");
    }
 	
    }

