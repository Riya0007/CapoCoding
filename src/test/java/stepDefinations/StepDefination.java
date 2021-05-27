package stepDefinations;

import org.testng.log4testng.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.ShoppingList;

public class StepDefination {
	
	public ShoppingList sp;
	public Home hp;
    AndroidDriver<AndroidElement>driver;
    Logger log =Logger.getLogger(StepDefination.class);

	 @Given("^user creates new lists \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_creates_new_lists_something_and_something(String strArg1, String strArg2) throws Throwable {
	        hp.createDoubleList(strArg1, strArg2);
	        log.info("Two lists are created");
	    }

	    @Given("^user creates one new lsits with name \"([^\"]*)\"$")
	    public void user_creates_one_new_lsits_with_name_something(String strArg1) throws Throwable {
	    	hp.createSingleList(strArg1);
	        log.info("Single list is  created");
	    }

	    @When("^user adds items in the list $")
	    public void user_adds_items_in_the_list() throws Throwable {
	        sp.addItems();
	        log.info("Items are added");
	    }


	    @Then("^user deletes \"([^\"]*)\" from list$")
	    public void user_deletes_something_from_list(String strArg1) throws Throwable {
	        sp.deleteItem(strArg1);
	        log.info("Item is deleted");
	    }

	    @Then("^user sorts the list $")
	    public void user_sorts_the_list() throws Throwable {
	       sp.sortList();
	       log.info("List is sorted");
	    }

}
