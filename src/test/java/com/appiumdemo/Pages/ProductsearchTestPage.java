package com.appiumdemo.Pages;

import java.util.List;

import org.hamcrest.Matchers;

import com.appiumdemo.Components.ProductcomponentTestPage;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductsearchTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	static String productName;
	static String productColor;

	@FindBy(locator = "product.search.Parent.Component")
	private List<ProductcomponentTestPage> productSearchParentComponent;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<ProductcomponentTestPage> getProductSearchParentComponent() {
		return productSearchParentComponent;
	}

	public void verifyProductSearchlist() {
		Validator.verifyThat(getProductSearchParentComponent().size(),
				Matchers.greaterThan(0));

		getProductSearchParentComponent().get(0).getProductName().waitForVisible();
		getProductSearchParentComponent().get(0).getProductColorType().waitForVisible();

		for (ProductcomponentTestPage products : getProductSearchParentComponent()) {
			System.out.println(products.getProductName().getText());
			System.out.println(products.getProductColorType().getText());

		}

	}

	public void verifySelectProduct() {
		ProductcomponentTestPage component =
				new ProductcomponentTestPage("product.search.Parent.Component");
		productName = component.getProductName().getText();
		productColor = component.getProductColorType().getText();

		component.getProductName().click();

	}

}
