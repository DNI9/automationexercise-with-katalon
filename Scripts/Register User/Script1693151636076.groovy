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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/HomePage/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/SignupAndLoginPage/SignupSection/input_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/SignupAndLoginPage/SignupSection/input_email'), 'test12312738971@test.com')

WebUI.click(findTestObject('Object Repository/SignupAndLoginPage/SignupSection/button_Signup'))

WebUI.click(findTestObject('Object Repository/SignupPage/AccountInformationSection/title_Mr'))

WebUI.setEncryptedText(findTestObject('Object Repository/SignupPage/AccountInformationSection/input__password'), 'RUP1i1I91Y1hyIPhPWM4AlrgLLfCQ3BM')

WebUI.selectOptionByValue(findTestObject('SignupPage/AccountInformationSection/select_Dob_Day'), '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignupPage/AccountInformationSection/select_Dob_Month'), '5', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignupPage/AccountInformationSection/select_Dob_Year'), '1999', 
    true)

WebUI.click(findTestObject('Object Repository/SignupPage/AccountInformationSection/radio_Receive special offers from our partners'))

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__first_name'), 'Test Nameasdasd')

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__last_name'), 'asdasdasd')

WebUI.setText(findTestObject('SignupPage/AddressInformationSection/input__address'), 'asdasdasdasd, asdasdasd')

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__state'), 'asdasdas')

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__city'), 'asdas')

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__zipcode'), '123456')

WebUI.setText(findTestObject('Object Repository/SignupPage/AddressInformationSection/input__mobile_number'), '1234567890')

WebUI.click(findTestObject('Object Repository/SignupPage/AddressInformationSection/button_create_account'))

WebUI.click(findTestObject('Object Repository/AccountCreatedPage/continue_link'))

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/b_Test'), 'Test')

WebUI.click(findTestObject('Object Repository/HomePage/a_Delete Account'))

WebUI.verifyElementText(findTestObject('Object Repository/AccountCreatedPage/b_Account Deleted'), 'Account Deleted!'.toUpperCase())

WebUI.click(findTestObject('Object Repository/AccountCreatedPage/continue_link'))

WebUI.closeBrowser()

