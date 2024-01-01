package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {

    POMFactory pomFactory = new POMFactory();

    @Given("User is on the retail website homepage")
    public void userIsOnTheRetailWebsiteHomepage() {
        Assert.assertTrue(pomFactory.homePage().tekSchoolLogo.isDisplayed());
        logger.info("TEKSCHOOL logo is displayed");
    }
    @When("(user clicks on the login link)")
    public void userClicksOnTheLoginLink() {
        click(pomFactory.retailSignInPage().signInLink);
        logger.info("Login Link was clicked successfully");
    }
    @When("User enters email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        sendText(pomFactory.retailSignInPage().emailField, email);
        sendText(pomFactory.retailSignInPage().passwordField, password);
        logger.info("Email and Password were entered successfully");
    }
    @When("clicks on login button")
    public void userClicksOnLoginButton() {
        click(pomFactory.retailSignInPage().loginBttn);
        logger.info("Login button was clicked successfully");
    }
    @Then("Verify user is logged in")
    public void verifyUserIsLoggedIn() {
        Assert.assertTrue(pomFactory.retailSignInPage().loginBttn.isDisplayed());
        logger.info("User is logged in successfully");
    }
    @When("User click on create new account link")
    public void userClickOnCreateNewAccountLink() {
    	click(pomFactory.retailSignInPage().newAccountBttn);
    	logger.info("Create new account bttn clicked successfully");
    }
    @When("User enter {string} and {string} and {string} and {string}")
    public void userEnterAndAndAnd(String name, String email, String password, String confPassword) {
    	sendText(pomFactory.retailSignInPage().namelnputField,name);
    	sendText(pomFactory.retailSignInPage().emailInputField,email);
    	sendText(pomFactory.retailSignInPage().passwordInputFie1d,password);
    	sendText(pomFactory.retailSignInPage().confirmpassInputFie1d,confPassword);
    	logger.info("User information was entered successfully");
    }
    @When("User click on signup button")
     public void userClickOnSignupButton() {
    	click(pomFactory.retailSignInPage().signupBttn);
        logger.info("signup button was clicked successfully");
    }
    @Then("Verify user account is created")
    public void verifyUserAccountIsCreated() {
    	Assert.assertTrue(pomFactory.retailSignInPage().yourProfi1eText.isDisplayed());
        logger.info("User account is created successfully");
}
    
    
}
