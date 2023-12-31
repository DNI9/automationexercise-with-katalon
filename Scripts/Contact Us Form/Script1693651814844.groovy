import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

'Navigating to contact us page'
WebUI.click(findTestObject('Object Repository/Common/Navigation/a_Contact us'))

WebUI.setText(findTestObject('Object Repository/Contact Us Page/name'), 'John')

WebUI.setText(findTestObject('Object Repository/Contact Us Page/email'), 'test@tes.com')

WebUI.setText(findTestObject('Object Repository/Contact Us Page/subject'), 'asdasdas')

WebUI.click(findTestObject('Object Repository/Contact Us Page/subject'))

WebUI.setText(findTestObject('Object Repository/Contact Us Page/message'), 'asdasdasd')

WebUI.click(findTestObject('Object Repository/Contact Us Page/btn_submit'))

WebUI.acceptAlert()

WebUI.verifyElementText(findTestObject('Contact Us Page/success_msg'), 'Success! Your details have been submitted successfully.')

WebUI.takeScreenshot('contact_us_screenshot.png')

WebUI.click(findTestObject('Common/Navigation/a_home'))

WebUI.closeBrowser()

