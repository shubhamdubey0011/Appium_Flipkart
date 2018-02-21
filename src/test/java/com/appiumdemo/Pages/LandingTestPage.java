package com.appiumdemo.Pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class LandingTestPage
		extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "landingPage.Skip.btn")
	private QAFWebElement landingPageSkipBtn;


	public QAFWebElement getLandingPageSkipBtn() {
		return landingPageSkipBtn;
	}

	public void verifyCloseBtn() {
		// TODO Auto-generated method stub
		landingPageSkipBtn.waitForVisible();
		landingPageSkipBtn.click();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}
	
	


}
