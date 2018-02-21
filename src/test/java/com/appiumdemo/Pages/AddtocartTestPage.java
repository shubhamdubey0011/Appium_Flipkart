package com.appiumdemo.Pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class AddtocartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	static String cartprodprice;
	static String cartprodname;

	@FindBy(locator = "addtocart.productname")
	private QAFWebElement addtocartProductname;
	@FindBy(locator = "addtocart.productprice")
	private QAFWebElement addtocartProductprice;

	@FindBy(locator = "addtocart.continue.btn")
	private QAFWebElement addtocartcontinuebtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getAddtocartProductname() {
		return addtocartProductname;
	}

	public QAFWebElement getAddtocartProductprice() {
		return addtocartProductprice;
	}

	public QAFWebElement getAddtocartContinuebtn() {
		return addtocartcontinuebtn;
	}

	public void verifyCartProductDetails() {
		cartprodname = addtocartProductname.getAttribute("name");
		System.out.println("actual details::"+cartprodname );
		//cartprodprice = addtocartProductprice.getText();

		
		System.out.println("expected details"+ ProductdetailTestPage.productname);
		Validator.verifyThat("carts-product Name verification",ProductdetailTestPage.productname ,
				Matchers.containsString(cartprodname));
//		Validator.verifyThat("carts-product price verification", cartprodprice,
//				Matchers.containsString(ProductdetailTestPage.productprice));

//		addtocartcontinuebtn.waitForVisible();
//		addtocartcontinuebtn.click();

	}

}
