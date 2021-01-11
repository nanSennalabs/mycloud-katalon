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

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0001 Send to warehouse menu button'))

WebUI.waitForElementPresent(findTestObject('Inbound - Send to warehouse (OMS)/0002 Create Inbound Order button'), 0)

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0002 Create Inbound Order button'))

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0003-1 select warehouse dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0003-2 select warehouse คลังทดสอบ'))

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0004 Checkbox I dont know the arrival date time'))

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0005 Add SKU button'))

WebUI.waitForElementPresent(findTestObject('Inbound - Send to warehouse (OMS)/0005-01 Select one product'), 0)

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0005-01 Select one product'))

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0005-02 Confirm SKUs button'))

WebUI.waitForElementPresent(findTestObject('Inbound - Send to warehouse (OMS)/0006 input Quantity'), 0)

WebUI.setText(findTestObject('Inbound - Send to warehouse (OMS)/0006 input Quantity'), '150')

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0007 Checkbox Ive read the instructions'))

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0008 Submit Inbound button'))

WebUI.waitForElementPresent(findTestObject('Inbound - Send to warehouse (OMS)/0009 Success OK button'), 0)

WebUI.click(findTestObject('Inbound - Send to warehouse (OMS)/0009 Success OK button'))

