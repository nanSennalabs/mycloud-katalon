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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Inbound - Incoming inbound (WMS)/Select Inbound menu'))

WebUI.waitForElementPresent(findTestObject('Inbound - Incoming inbound (WMS)/Select Incoming Inbound'), 0)

WebUI.click(findTestObject('Inbound - Incoming inbound (WMS)/Select Incoming Inbound'))

WebUI.click(findTestObject('Inbound - Incoming inbound (WMS)/Select the firsrt IO Number'))

WebUI.waitForElementPresent(findTestObject('Inbound - Incoming inbound (WMS)/inputCourier'), 0)

WebUI.setText(findTestObject('Inbound - Incoming inbound (WMS)/inputCourier'), 'Kerry')

WebUI.scrollToElement(findTestObject('Inbound - Incoming inbound (WMS)/select Confirm Receipt'), 0)

WebUI.uploadFile(findTestObject('Inbound - Incoming inbound (WMS)/select upload signed reciept file'), '/Users/phutthikiatphonil/Desktop/receipt.png')

WebUI.uploadFile(findTestObject('Inbound - Incoming inbound (WMS)/select photo evidencee'), '/Users/phutthikiatphonil/Desktop/evidencee.png')

WebUI.delay(10)

WebUI.click(findTestObject('Inbound - Incoming inbound (WMS)/select Confirm Receipt'))

