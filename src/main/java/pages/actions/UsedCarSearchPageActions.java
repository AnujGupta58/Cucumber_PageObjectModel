package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utilities.SeleniumDriver;

public class UsedCarSearchPageActions {

	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;
	
	public UsedCarSearchPageActions() {
		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	
	public void selectCarMake(String carBrand) {
		//carSearchPageLocators.block.click();
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.carMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.carModelDropdown);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String carlocation) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.locationDropdown);
		selectCarMaker.selectByVisibleText(carlocation);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(usedCarsSearchPageLocators.carPriceDropdown);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnfindMyNextCarButton() {
		usedCarsSearchPageLocators.findMyNextCarButton.click();
	}

	
}
