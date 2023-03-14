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

WebUI.openBrowser(GlobalVariable.webURL)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/input search kota'))

WebUI.setText(findTestObject('Web/Hotel/Search page/input search kota'), 'yogyakarta')

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/first option jgj'))

WebUI.click(findTestObject('Web/Hotel/Search page/first option jgj'))

WebUI.click(findTestObject('Web/Hotel/Search page/button search'))

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/first list hotel'))

WebUI.click(findTestObject('Web/Hotel/Search page/first list hotel'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/pesan hotel'))

WebUI.click(findTestObject('Web/Hotel/Search page/pesan hotel'))

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/pilih kamar'))

WebUI.click(findTestObject('Web/Hotel/Search page/pilih kamar'))

WebUI.verifyElementVisible(findTestObject('Web/Hotel/Search page/btn masuk'))

WebUI.setText(findTestObject('Web/Hotel/Search page/input name'), firstName)

WebUI.setText(findTestObject('Web/Hotel/Search page/input phone'), phone)

WebUI.setText(findTestObject('Web/Hotel/Search page/input email'), email)

if(guest == "berbeda") {
	WebUI.setText(findTestObject('Web/Hotel/Search page/input guest'), firstName)
}

WebUI.click(findTestObject('Web/Hotel/Search page/checkbox liburan'))

WebUI.click(findTestObject('Web/Hotel/Search page/checkbox termCondition'))

WebUI.click(findTestObject('Web/Hotel/Search page/button bayar'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

