package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
    
    public RetailSignInPage() {
        PageFactory.initElements(getDriver(), this);
    }
  
    @FindBy(linkText ="tekschool") 
    public WebElement tekSchoolLogo;
    
    @FindBy(linkText ="Sign in")
    public WebElement signInLink; 
    
    @FindBy(id ="email") 
    public WebElement emailField; 
    
    @FindBy(id ="password") 
    public WebElement passwordField;
    
    @FindBy(xpath ="//button[text()=")
    public WebElement loginBttn; 
    
    @FindBy(linkText ="logoutBtn") 
    public WebElement logoutBttn; 
    
    @FindBy(id ="newAccountBtn") 
    public WebElement newAccountBttn; 
    
    @FindBy(id ="namelnput") 
    public WebElement namelnputField; 
    
    @FindBy(id ="emailInput") 
    public WebElement emailInputField; 
    
    @FindBy(id = "passwordInput")
    public WebElement passwordInputFie1d; 
    
    @FindBy(id ="confirmpasswordlnput") 
    public WebElement confirmpassInputFie1d; 
    
    @FindBy (id = "signupBtn") 
    public WebElement signupBttn; 
   
    @FindBy(xpath = "//h1[text()=Your Profile']")
   public WebElement yourProfi1eText; 
    
}

    
