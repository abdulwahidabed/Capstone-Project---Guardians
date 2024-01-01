package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
    private RetailHomePage homePage;
    private RetailSignInPage retailSignInPage;
	private RetailHomePage retailHomePage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retialOrderPage;
	

    public POMFactory() {
        this.homePage = new RetailHomePage();
        this.retailSignInPage = new RetailSignInPage();
        this.retailAccountPage = new RetailAccountPage();
        this.retialOrderPage = new RetailOrderPage();

    }

    public RetailHomePage homePage() {
        return this.homePage;
    }
    public RetailSignInPage retailSignInPage() {
        return this.retailSignInPage;
    }
    public RetailHomePage retailHomePage() {
    	return this.retailHomePage;
    }
    public RetailAccountPage retailAccountPage() {
    	return this.retailAccountPage;
    }
    public RetailOrderPage retialOrderPage() {
    	return this.retialOrderPage;
    }

}