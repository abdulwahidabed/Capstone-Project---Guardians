package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

import java.util.List;

public class RetailHomeSteps extends CommonUtility {

    POMFactory pomFactory = new POMFactory();
    
    @When("User click on all section")
    public void userClicksOnAllSection() {
        click(pomFactory.retailHomePage().allOptions);
        logger.info("All options dropdown was clicked");
    }
    
    @Then("below options are present in shop by department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSideBar(DataTable dataTable) {
    	
    	List<List<String>> shopByDepartment = dataTable.asLists(String.class);

    			
        for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
            Assert.assertTrue(isElementDisplayed(
                    getDriver().findElement(By.xpath("//div[@class='sidebar_content']//span[text()='"+shopByDepartment.get(0).get(i)+"']"))));
            logger.info("Option "+shopByDepartment.get(0).get(i)+ " is displayed");
        }
    }
}
