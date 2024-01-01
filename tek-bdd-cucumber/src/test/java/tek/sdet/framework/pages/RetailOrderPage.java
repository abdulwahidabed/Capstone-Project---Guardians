package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderPage extends CommonUtility {

    POMFactory pomFactory = new POMFactory();
    
    @FindBy(id = "search")
    public WebElement allDepartmentDropdown;

    @FindBy(id = "searchInput")
    public WebElement searchInputField;

    @FindBy(id = "searchBtn")
    public WebElement searchBttn;

    @FindBy(tagName = "//img[@alt='kasa Outdoor Smart Plug")
    public WebElement itemKasaOutdoorSmartPlug;

    @FindBy(xpath = "//select[starts-with(@class, 'product')]")
    public WebElement qtyDropdown;

    @FindBy(id = "addToCartBtn")
    public WebElement addToCartBttn;
    
    @FindBy(xpath = "//span[@id=cartQuatity']")
    public WebElement cartItemQty;

    @FindBy(id = "cartBtn")
    public WebElement CartBttn;

    @FindBy(id = "proceedBtn")
    public WebElement proceedToCheckoutBttn;
    
    @FindBy(id = "placeOrderBtn")
    public WebElement placeOrderBttn;
    
    @FindBy(xpath = "//div[text()='order placed Successfully']")
    public WebElement orderPlacedSuccessfullyMssg;
    
    @FindBy(xpath = "//img[starts-with(@alt,'Apex Legend')]")
    public WebElement apexlengendsItem;
    


}
