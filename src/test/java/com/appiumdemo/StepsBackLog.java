/**
 * 
 */
package com.appiumdemo;

import com.appiumdemo.Pages.AddtocartTestPage;
import com.appiumdemo.Pages.HomeTestPage;
import com.appiumdemo.Pages.LandingTestPage;
import com.appiumdemo.Pages.ProductdetailTestPage;
import com.appiumdemo.Pages.ProductsearchTestPage;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepAdapter;

/**
 * @author Shubham.Dubey
 */
public class StepsBackLog extends QAFTestStepAdapter {

	LandingTestPage landingpage = new LandingTestPage();
	HomeTestPage homepage = new HomeTestPage();

	@QAFTestStep(description = "user is on the landinPage and selects close signup")
	public void userIsOnTheLandinPageAndSelectsCloseSignup() {

		landingpage.verifyCloseBtn();
	}

	@QAFTestStep(description = "is user in on the homepage and searches for {0}")
	public void isUserInOnTheHomepageAndSearchesFor(String str0) {

		homepage.verifyProductSearchtxtBox();
		homepage.verifyProductBrancSearch();
		homepage.verifySelectIpadInTablets();
	}

	@QAFTestStep(description = "user sorts the produts in low to high price order")
	public void userSortsTheProdutsInLowToHighPriceOrder() {

		homepage.verifySortByPrice();
	}

	@QAFTestStep(description = "user selects the prdouct from the list of available products")
	public void userSelectsThePrdouctFromTheListOfAvailableProducts() {

		ProductsearchTestPage product = new ProductsearchTestPage();
		product.verifyProductSearchlist();
		product.verifySelectProduct();

	}

	
	@QAFTestStep(description = "user adds the product to its  cart")
	public void userAddsTheProductToItsCart() 
	{
	       ProductdetailTestPage productdetails = new ProductdetailTestPage();
	       productdetails.verifyProductDetails();
	       productdetails.verifySelectAddToCart();
	       
	}


	@QAFTestStep(description = "user navigates to cart page")
	public void userNavigatesToCartPage() {
		 ProductdetailTestPage productdetails = new ProductdetailTestPage();
		 productdetails.verifySelectGoToCart();
		 
		 AddtocartTestPage cartpage = new AddtocartTestPage();
		 cartpage.verifyCartProductDetails();
		 
		 
		 
	}

}
