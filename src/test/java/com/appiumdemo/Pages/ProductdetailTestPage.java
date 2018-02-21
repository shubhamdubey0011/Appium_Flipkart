package com.appiumdemo.Pages;

import org.hamcrest.Matchers;
import org.testng.Reporter;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	static String productname;

	static String productprice;

	@FindBy(locator = "productdetail.page.productname")
	private QAFWebElement productdetailPageProductname;

	@FindBy(locator = "productdetail.page.productprice")
	private QAFWebElement productdetailPageProductprice;

	@FindBy(locator = "productdetail.page.addtocart.btn")
	private QAFWebElement productdetailPageAddtocartBtn;

	@FindBy(locator = "productdetail.page.gotocart.btn")
	private QAFWebElement productdetailPageGotocartBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getProductdetailPageProductname() {
		return productdetailPageProductname;
	}

	public QAFWebElement getProductdetailPageProductprice() {
		return productdetailPageProductprice;
	}

	public QAFWebElement getProductdetailPageAddtocartBtn() {
		return productdetailPageAddtocartBtn;
	}

	public QAFWebElement getProductdetailPageGotocartBtn() {
		return productdetailPageGotocartBtn;
	}

	public void verifyProductDetails() {

		ProductsearchTestPage productsearchpage = new ProductsearchTestPage();
		// System.out.println("******************************"+
		// productsearchpage.productName);
		Validator.verifyThat("product Name verification",
				productdetailPageProductname.getText(),
				Matchers.containsString(productsearchpage.productName));

		productname = productdetailPageProductname.getText();
		productprice = productdetailPageProductprice.getText();

		System.out.println("User has selected ::" + productname);
		System.out.println("product Price details  ::" + productprice);

	}

	public void verifySelectAddToCart() {
		productdetailPageAddtocartBtn.waitForVisible();
		productdetailPageAddtocartBtn.click();

	}

	public void verifySelectGoToCart() {

		productdetailPageGotocartBtn.waitForVisible();
		productdetailPageGotocartBtn.click();
		
		AddtocartTestPage cartpage = new AddtocartTestPage();
		cartpage.verifyCartProductDetails();

	}

}
