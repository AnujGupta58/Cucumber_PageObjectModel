package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarSearchPageActions;

public class UsedCarSearchSteps {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarSearchPageActions usedCarSearchPageActions = new UsedCarSearchPageActions();
	
	@And("^click on \"([^\"]*)\" link on Used Car Search Page$")
	public void click_on_link_on_Used_Car_Search_Page(String arg1) throws Throwable {
	    carsGuideHomePageActions.clickOnUsedCarsMenu();
	}

	@And("^I select carbrand as \"([^\"]*)\" from make dropdown on Used Car Search Page$")
	public void i_select_carbrand_as_from_make_dropdown_on_Used_Car_Search_Page(String carBrand) throws Throwable {
		usedCarSearchPageActions.selectCarMake(carBrand);
	}

	@And("^I select Carmodel on Used Car Search Page$")
	public void i_select_Carmodel_on_Used_Car_Search_Page(List<String> list) throws Throwable {
		String menu = list.get(1);
		usedCarSearchPageActions.selectCarModel(menu);
	}

	@And("^I select location as \"([^\"]*)\" from location dropdown on Used Car Search Page$")
	public void i_select_location_as_from_location_dropdown_on_Used_Car_Search_Page(String carlocation) throws Throwable {
	  usedCarSearchPageActions.selectCarLocation(carlocation);
	}

	@And("^I select CarPrice as \"([^\"]*)\" from price dropdown on Used Car Search Page$")
	public void i_select_CarPrice_as_from_price_dropdown_on_Used_Car_Search_Page(String carPrice) throws Throwable {
		usedCarSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button on Used Car Search Page$")
	public void click_on_Find_My_Next_Car_button_on_Used_Car_Search_Page() throws Throwable {
	  usedCarSearchPageActions.clickOnfindMyNextCarButton();
	}

	@Then("^I should see the search cars on Used Car Search Page$")
	public void i_should_see_the_search_cars_on_Used_Car_Search_Page() throws Throwable {
	    System.out.println("Used cars list appears");
	    
	}
}
