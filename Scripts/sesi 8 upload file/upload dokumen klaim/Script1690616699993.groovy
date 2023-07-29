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

WebUI.navigateToUrl('https://demo.phirogo.com/')

WebUI.setText(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/input_Username_username'), 
    'S010190004')

WebUI.setEncryptedText(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/input_Password_password'), 
    'UVtfJGdeBvfIMaepKu3Nww==')

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/button_Sign In'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/div_Claim'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/div_Claim Type_Select-control'))

WebUI.click(findTestObject('sesi 8 upload file/upload medical claim document/Page_SAAS/div_Medical Claim'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/input_Claim Date_form__form-group-datepicke_e5dd59'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/span_2023'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/div_2023'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/span_July'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/div_July'))

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/div_29'))

WebUI.setText(findTestObject('sesi 8 upload file/upload medical claim document/Page_SAAS/input'), 'Rp500.000')

WebUI.uploadFile(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/label_Choose the file'), 
    'D:\\book\\DIKBANGSPES SABHARA 2023\\Pengawalan.pdf')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/sesi 8 upload file/upload medical claim document/button_Submit'))

WebUI.closeBrowser()

