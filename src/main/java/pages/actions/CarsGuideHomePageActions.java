package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	/*
	 * Approaches - 1. One Actions can be multiple functionality with single method
	 * 2. One Actions can single functionality can be divided into different
	 * multiple method
	 */
	
	public void moveTobuySellMenu() {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomePageLocators.buySell_link).perform();
	}
	
	public void clickOnSearchCarsMenu() {
		//moveTobuySellMenu
		carsGuideHomePageLocators.searchCars_link.click();
	}
	
	public void clickOnUsedCarsMenu() {
		//moveTobuySellMenu
		carsGuideHomePageLocators.usedCars_link.click();
	}
	
	public void clickOnSellMyCarMenu() {
		//moveTobuySellMenu
		carsGuideHomePageLocators.sellMyCar_link.click();
	}
	
	public void moveToReviewsMenu() {
		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(carsGuideHomePageLocators.reviews_link).perform();
	}
	
}


