package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
		@FindBy(linkText = "Account")
		public WebElement accountLink;
		
		@FindBy(id = "nameInput")
		public WebElement nameField;
		
		@FindBy(id = "personalPhoneInput")
		public WebElement Phonefield;
		
		@FindBy(id = "personalUpdateBtn")
		public WebElement updateBttn;
		
		@FindBy(xpath = "//div[text()='Personal Information Update Sucessfully']")
		public WebElement personalInfoUpdateSuccessMssg;
		
		@FindBy(xpath = "//p[text()='Add a payment method']")
		public WebElement addAPaymentMethodLink;
		
		@FindBy(id = "cardNumberInput")
		public WebElement cardNumberField;
		
		@FindBy(id = "nameOnCardInput")
		public WebElement nameOnCardField;
		
		@FindBy(id = "expirationMonthInput")
		public WebElement expirationMonthField;
		
		@FindBy(id = "expirationYearInput")
		public WebElement expirationYearField;
		
		@FindBy(id = "securityCodeInput")
		public WebElement securityCodeField;
		
		@FindBy(id = "paymentSubmitBtn")
		public WebElement paymentSubmitBtn;
		
		@FindBy(xpath = "//div[text()='Payment Method added Successfuly']")
		public WebElement paymentMethodSuccessMssg;
		
		@FindBy(xpath = "//div[starts-with(@class,'account_address-new-')]")
		public WebElement addAddressLink;
		
		@FindBy(id = "countryDropdown")
		public WebElement AddressCountryDropdown;
		
		@FindBy(id = "fullNameInput")
		public WebElement addressNameField;
		
		@FindBy(id ="phoneNumberInput")
		public WebElement addressPhoneField;
		
		@FindBy(id = "streetInput")
		public WebElement addressStreetField;
		
		@FindBy(id = "apartmentInput")
		public WebElement addressApartmentnum;
		
		@FindBy(id = "cityInput")
		public WebElement addressCityField;
		
		@FindBy(name = "state")
		public WebElement addressStateDropdown;
		
		@FindBy(id = "zipCodeInput")
		public WebElement addressZipCodeField;
		
		@FindBy(id = "addressBtn")
		public WebElement addressAddBttn;
		
		@FindBy(xpath = "//div[text()='Address Added Successfull")
		public WebElement addressSuccessMssg;

		public WebElement orderPlacedSuccessfullyMssg;
		
		

		{

		
	}

}
