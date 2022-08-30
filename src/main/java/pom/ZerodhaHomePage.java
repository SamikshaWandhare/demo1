package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaHomePage {
	
	@FindBy (xpath = "//input[@placeholder=\'Search eg: infy bse, nifty fut, nifty weekly, gold mcx\']") private WebElement search;
	@FindBy (xpath = "//span[@class='tradingsymbol']") private List<WebElement> searchResult;
	@FindBy (xpath = "//button[@data-balloon=\"Buy\"]") private WebElement searchBuy ;
	@FindBy (xpath = "//button[@class=\'button-orange\']") private WebElement searchSell ;
	@FindBy (xpath = "//span[@class=\'icon icon-align-center\']") private WebElement marketDepth;
	@FindBy (xpath = "//button[@class=\'button-outline\'][1]") private WebElement chart;
	@FindBy (xpath = "//span[@class=\'icon icon-plus\']") private WebElement addToWatchlist;
	
	
	public ZerodhaHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	public void searchStock(String stock, WebDriver driver)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(stock);		
	}
	
	public int getSearchResultNumber() {
		int listsize = searchResult.size();
		return listsize;
	}
	
	public void searchAndSelectDesiredStock(WebDriver driver, String RequiredStock)  {
		for(int a = 0; a < searchResult.size(); a++) 
		
		{
			WebElement s = searchResult.get(a);
			String StockName = s.getText();
			if(StockName.equals(RequiredStock)) 
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(s);
				actions.perform();
				break;
			}	
			
		}
	}
	
	public void clickOnSearchresultBuy() {
		searchBuy.click();
	}
	

	public void clickOnSearchresultSell() {
		searchSell.click();
	}
	
	public void clickOnSearchresultMarketDepth() {
		marketDepth.click();
	}
	
	public void clickOnSearchresultChart() {
		chart.click();
	}
	
	public void clickOnSearchresultAddToWatchlist() {
		addToWatchlist.click();
	}
	
	
	

}