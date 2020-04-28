package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarSearchPageActions {
	CarSearchPageLocators carSearchPageLocators = null;
	
	public CarSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		//carSearchPageLocators.block.click();
		Select selectCarMaker = new Select(carSearchPageLocators.carMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker = new Select(carSearchPageLocators.carModelDropdown);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectCarLocation(String carlocation) {
		Select selectCarMaker = new Select(carSearchPageLocators.locationDropdown);
		selectCarMaker.selectByVisibleText(carlocation);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker = new Select(carSearchPageLocators.carPriceDropdown);
		selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnfindMyNextCarButton() {
		carSearchPageLocators.findMyNextCarButton.click();
	}
	
}
