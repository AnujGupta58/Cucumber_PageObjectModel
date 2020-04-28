package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how = How.LINK_TEXT,using = "buy + sell")
	public WebElement buySell_link;
	
	@FindBy(how = How.LINK_TEXT,using = "reviews")
	public WebElement reviews_link;
	
	@FindBy(how = How.LINK_TEXT,using = "news")
	public WebElement news_link;
	
	@FindBy(how = How.LINK_TEXT,using = "advice")
	public WebElement advices_link;
	
	@FindBy(how = How.LINK_TEXT,using = "pricing + specs")
	public WebElement pricingSpecs_link;
	
	@FindBy(how = How.LINK_TEXT,using = "Search Cars")
	public WebElement searchCars_link;
	
	@FindBy(how = How.LINK_TEXT,using = "Used")
	public WebElement usedCars_link;
	
	@FindBy(how = How.LINK_TEXT,using = "Sell my car")
	public WebElement sellMyCar_link;
}
