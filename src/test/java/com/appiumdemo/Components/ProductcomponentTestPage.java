package com.appiumdemo.Components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductcomponentTestPage extends QAFWebComponent {

	public ProductcomponentTestPage(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	@FindBy(locator = "product.name")
	private QAFWebElement productName;
	
	@FindBy(locator = "product.color.Type")
	private QAFWebElement productColorType;

	public QAFWebElement getProductName() {
		return productName;
	}

	public QAFWebElement getProductColorType() {
		return productColorType;
	}

}
