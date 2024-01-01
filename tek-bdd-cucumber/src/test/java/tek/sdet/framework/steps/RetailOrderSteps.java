package tek.sdet.framework.steps;

import tek.sdet.framework.utilities.CommonUtility;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;

public class RetailOrderSteps extends CommonUtility {

    POMFactory pomFactory = new POMFactory();

    @Then("User change the category to {string}")
    public void userChangeTheCategoryTo(String category) {
        selectByVisibleText(pomFactory.retialOrderPage().allDepartmentDropdown, category);
        logger.info("Category was selected successfully from dropdown");
    }

    @Then("User search for an item {string}")
    public void userSearchForAnItem(String kasaOutdoorSmartPlug) {
        sendText(pomFactory.retialOrderPage().searchInputField, kasaOutdoorSmartPlug);
        logger.info("Item name was entered successfully");
    }

    @Then("User click on Search icon")
    public void userClickOnSearchIcon() {
        click(pomFactory.retialOrderPage().searchBttn);
        logger.info("Search button was clicked successfully");
    }

    @Then("User click on item")
    public void userClickOnItem() {
        click(pomFactory.retialOrderPage().itemKasaOutdoorSmartPlug);
        logger.info("Item clicked successfully");
    }

    @Then("User select quantity {string}")
    public void userSelectQuantity(String itemQty) {
        selectByVisibleText(pomFactory.retialOrderPage().qtyDropdown, itemQty);
        logger.info("Item quantity was selected successfully");
    }

    @Then("User click add to Cart button")
    public void userClickAddToCartButton() {
        click(pomFactory.retialOrderPage().addToCartBttn);
        logger.info("Add item to the cart button was clicked successfully");
    }

    @Then("the cart icon quantity should change to {string}")
    public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
        Assert.assertEquals(itemQtyInTheCart, pomFactory.retialOrderPage().cartItemQty);
        logger.info("Item quantity in the cart was validated successfully");
    }
    
    @Then("User change the category to {string} Aprx Legends")
    public void userChangeTheCategoryToApexLegends(String electronics){
    	selectByVisibleText(pomFactory.retialOrderPage().allDepartmentDropdown, electronics);
        logger.info("Category changed to electronics successfully");
    }
    @Then("User search for an item {string} Apex Legends")
   public void userSearchForAnItemAPexLegends(String apexLegends) {
    	sendText(pomFactory.retialOrderPage().searchInputField, apexLegends);
    	logger.info("Item Apex Legend was entered successfully");
    }
    @Then("User click on item Apex Legends")
    public void userClickOnItemApexLegends(String apexLegendsQty) {
    	selectByVisibleText(pomFactory.retialOrderPage().qtyDropdown, apexLegendsQty);
    	logger.info("apex Legends qty was changed Successfully");
    }
    @Then("the cart icon quantity should change to {string} Apex legends")
    public void theCartIconQuantityShouldChangeToApexLegends(String itemQtyInTheCart) {
    	logger.info("Item qty in the cart was validated successfully");
    }
    @Then("User click on the cart option ")
    public void userClickOnTheCartOption() {
    	click(pomFactory.retialOrderPage().CartBttn);
    	logger.info("Cart Button was clicked succesfully");
    }
    @Then("User click on proceed to checkout button")
    public void userClickOnProceedToCheckoutButton() {
    	click(pomFactory.retialOrderPage().placeOrderBttn);
    	logger.info("place your order button was clicked successfully");
    }
 
    	
    }
    }
}

        
     
       

