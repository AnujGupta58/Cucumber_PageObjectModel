package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	
	@Given("^I am on Home Page \"([^\"]*)\" of Cars Guide Website$")
	public void i_am_on_Home_Page_of_Cars_Guide_Website(String websiteURL) throws Throwable {
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("^I go to menu$")
	public void i_go_to_menu(List<String> list) throws Throwable {
	 
		String menu = list.get(1);
		System.out.println("menu selected - "+ menu);
		carsGuideHomePageActions.moveTobuySellMenu();
		//Assert.fail("Failing this test");
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
	   carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^I select carbrand as \"([^\"]*)\" from make dropdown$")
	public void i_select_carbrand_as_from_make_dropdown(String carBrand) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    carSearchPageActions.selectCarMake(carBrand);
	}

	@And("^I select Carmodel as \"([^\"]*)\" from model dropdown$")
	public void i_select_Carmodel_as_from_model_dropdown(String carModel) throws Throwable {
	    carSearchPageActions.selectCarModel(carModel);
	}

	@And("^I select location as \"([^\"]*)\" from location dropdown$")
	public void i_select_location_as_from_location_dropdown(String location) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    carSearchPageActions.selectCarLocation(location);
	}

	@And("^I select CarPrice as \"([^\"]*)\" from price dropdown$")
	public void i_select_CarPrice_as_from_price_dropdown(String carPrice) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    carSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 carSearchPageActions.clickOnfindMyNextCarButton();
	}

	@Then("^I should see the search cars$")
	public void i_should_see_the_search_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("list of searched cars");
	}

	@And("^the title of the page should be \"([^\"]*)\"$")
	public void the_title_of_the_page_should_be(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("page title..");
	}

}
