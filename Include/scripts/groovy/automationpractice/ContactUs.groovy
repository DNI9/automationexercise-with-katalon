package automationpractice
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

class ContactUs {

	/**
	 * Step definition for testing contact us functionality
	 */
	@Given("I navigate to the contact us page")
	def I_navigate_to_the_login_page() {
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Common/Navigation/a_Contact us'))
	}

	@When('I enter name "(.*)" email "(.*)" subject "(.*)" and message "(.*)" and click submit')
	def I_enter_name_email_subject_and_message(String name, String email, String subject, String message) {
		WebUI.setText(findTestObject('Object Repository/Contact Us Page/name'), name)
		WebUI.setText(findTestObject('Object Repository/Contact Us Page/email'), email)
		WebUI.setText(findTestObject('Object Repository/Contact Us Page/subject'), subject)
		WebUI.setText(findTestObject('Object Repository/Contact Us Page/message'), message)
		WebUI.click(findTestObject('Object Repository/Contact Us Page/btn_submit'))
	}

	@Then('I verify the success message "(.*)" is shown')
	def I_verify_the_success_message_is_shown(String successMessage) {
		WebUI.acceptAlert()
		WebUI.verifyElementText(findTestObject('Contact Us Page/success_msg'), successMessage)
		WebUI.closeBrowser()
	}
}