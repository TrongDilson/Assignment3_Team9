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

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Eventify/input_Email_email'), 'user1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Eventify/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Eventify/button_Sign In_1'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/a_Events'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/span_Discussions'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/p_9172025'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/div_0 comments'))

WebUI.click(findTestObject('Object Repository/Page_Eventify/div_Previous slideNext slide'))

