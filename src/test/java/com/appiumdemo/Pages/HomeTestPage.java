package com.appiumdemo.Pages;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> 
{


	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	
	@FindBy(locator = "com.flipkart.androididsearchautocompletetextview")
	private QAFWebElement comFlipkartAndroididsearchautocompletetextview;

	@FindBy(locator = "com.flipkart.androidacsbltyid.productsearchbox")
	private QAFWebElement androidacsbltyidproductsearchbox;

	@FindBy(locator = "com.flipkart.list.option.ipadInTablets")
	private QAFWebElement list_ipadintablets;

	@FindBy(locator = "com.flipkart.sortbyprice.lowtohigh")
	private QAFWebElement sortbyprice_lowtohigh;
	
	@FindBy(locator = "com.flipkart.filter.price.lowToHigh")
	private QAFWebElement filter_price_lowtohigh;
	
	
	


	public QAFWebElement getComFlipkartAndroididsearchautocompletetextview() {
		return comFlipkartAndroididsearchautocompletetextview;
	}

	public QAFWebElement getandroidacsbltyidproductsearchbox() {
		return androidacsbltyidproductsearchbox;
	}

	public QAFWebElement getlist_ipadInTablets() {
		return list_ipadintablets;
	}

	public QAFWebElement getsortbyprice_lowtohigh() {
		return sortbyprice_lowtohigh;
	}
	
	public QAFWebElement getfilter_price_lowtohigh() 
	{
		return filter_price_lowtohigh;
	}

	public void verifyProductSearchtxtBox() {

		comFlipkartAndroididsearchautocompletetextview.waitForVisible();
		comFlipkartAndroididsearchautocompletetextview.click();
	}

	public void verifyProductBrancSearch() {
		androidacsbltyidproductsearchbox.waitForVisible();
		androidacsbltyidproductsearchbox.sendKeys("ipad");

	}

	public void verifySelectIpadInTablets() {

		list_ipadintablets.click();

	}

	public void verifySortByPrice() {
		sortbyprice_lowtohigh.waitForVisible();
		sortbyprice_lowtohigh.click();
		filter_price_lowtohigh.waitForVisible();
		filter_price_lowtohigh.click();
		
	}
}
