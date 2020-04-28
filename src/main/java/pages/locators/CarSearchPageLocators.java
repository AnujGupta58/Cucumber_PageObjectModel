package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how = How.XPATH,using = "//select[@id=\"makes\"]")
	public WebElement carMakeDropdown;
	
	@FindBy(how = How.XPATH,using = "//select[@id=\"models\"]")
	public WebElement carModelDropdown;
	
	@FindBy(how = How.XPATH,using = "//select[@id=\"locations\"]")
	public WebElement locationDropdown;
	
	@FindBy(how = How.XPATH,using = "//select[@id=\"priceTo\"]")
	public WebElement carPriceDropdown;
	
	@FindBy(how = How.XPATH,using = "//input[@id=\"search-submit\"]")
	public WebElement findMyNextCarButton;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"block-system-main\"]/div/div/div/div")
	public WebElement block;
}
