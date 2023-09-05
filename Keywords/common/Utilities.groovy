package common
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class Utilities {

	/**
	 * Opens browser with default profile URL and maximizes the browser window.
	 */
	@Keyword(keywordObject = "BrowserUtils")
	def openBrowser() {
		KeywordUtil.logInfo("Opening browser")

		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow();

		KeywordUtil.markPassed("Browser opened successfully")
	}
}