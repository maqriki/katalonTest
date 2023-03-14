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

WebUI.waitForElementVisible(findTestObject('Web/Homepage/Navigation pesawat'), 20)

WebUI.click(findTestObject('Web/Homepage/Navigation pesawat'))

WebUI.waitForElementVisible(findTestObject('Web/Penerbangan/Form search/input kota asal'), 20)

WebUI.setText(findTestObject('Web/Penerbangan/Form search/input kota asal'), kotaAsal)

optionKotaAsal = findTestObject('Web/Penerbangan/Form search/option dynamic', [('cityCode') : kodeKotaAsal])

WebUI.waitForElementVisible(optionKotaAsal, 20)

WebUI.click(optionKotaAsal)

WebUI.click(findTestObject('Web/Penerbangan/Form search/input tanggal keberangkatan'))

WebUI.verifyElementVisible(findTestObject('Web/Penerbangan/Form search/current date'))

WebUI.click(findTestObject('Web/Penerbangan/Form search/current date'))

if (tipePenerbangan == 'pulang pergi') {
    WebUI.setText(findTestObject('Web/Penerbangan/Form search/input kota tujuan'), kotaTujuan)

    optionKotaTujuan = findTestObject('Web/Penerbangan/Form search/option dynamic', [('cityCode') : kodeKotaTujuan])

    WebUI.waitForElementVisible(optionKotaTujuan, 20)

    WebUI.click(optionKotaTujuan)

    WebUI.click(findTestObject('Web/Penerbangan/Form search/checkbox pulang'))

    WebUI.click(findTestObject('Web/Penerbangan/Form search/input tanggal pulang'))

    WebUI.verifyElementVisible(findTestObject('Web/Penerbangan/Form search/current date'))

    WebUI.click(findTestObject('Web/Penerbangan/Form search/current date'))
}

WebUI.click(findTestObject('Web/Penerbangan/Form search/button_cari_tiket'))

WebUI.verifyElementVisible(findTestObject('Web/Penerbangan/Search result/button tiket pergi'))

WebUI.click(findTestObject('Web/Penerbangan/Search result/button tiket pergi'))

if (tipePenerbangan == 'pulang pergi') {
    WebUI.verifyElementVisible(findTestObject('Web/Penerbangan/Search result/button tiket pulang'))

    WebUI.click(findTestObject('Web/Penerbangan/Search result/button tiket pulang'))
}

WebUI.verifyElementVisible(findTestObject('Web/Base/text total'))

WebUI.scrollToElement(findTestObject('Web/Base/Button lanjutkan'), 5)

WebUI.click(findTestObject('Web/Base/Button lanjutkan'))

WebUI.verifyElementVisible(findTestObject('Web/page data pemesan/input first name'))

WebUI.setText(findTestObject('Web/page data pemesan/input first name'), firstName)

WebUI.setText(findTestObject('Web/page data pemesan/input last name'), lastName)

WebUI.setText(findTestObject('Web/page data pemesan/input phone'), phone)

WebUI.setText(findTestObject('Web/page data pemesan/input email'), email)

WebUI.click(findTestObject('Web/Base/Button lanjutkan'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web/Base/text total'))

WebUI.scrollToElement(findTestObject('Web/Base/Button lanjutkan'), 5)

WebUI.click(findTestObject('Web/page data pemesan/checkbox persetujuan'))

WebUI.click(findTestObject('Web/Base/Button lanjutkan'))

WebUI.scrollToElement(findTestObject('Web/Base/Modal dialog'), 5)

WebUI.takeScreenshot(null)

WebUI.closeBrowser()

