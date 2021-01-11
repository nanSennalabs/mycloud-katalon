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

WebUI.delay(3)

WebUI.click(findTestObject('Create new product (OMS)/0002 Product List menu button'))

WebUI.waitForElementPresent(findTestObject('Create new product (OMS)/0003 Select Add New Product button'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Create new product (OMS)/0003 Select Add New Product button'))

WebUI.waitForElementPresent(findTestObject('Create new product (OMS)/0004 input product name'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('Create new product (OMS)/0004 input product name'), 'Test product name')

WebUI.setText(findTestObject('Create new product (OMS)/0005 input product desc'), 'test description')

WebUI.click(findTestObject('Create new product (OMS)/0006 select product category dropdown'))

WebUI.waitForElementPresent(findTestObject('Create new product (OMS)/0007 Select one category'), 0)

WebUI.click(findTestObject('Create new product (OMS)/0007 Select one category'))

WebUI.setText(findTestObject('Create new product (OMS)/0008 input unit cost'), '100')

WebUI.setText(findTestObject('Create new product (OMS)/0009 input unit price'), '150')

WebUI.click(findTestObject('Create new product (OMS)/0010 select storage type dropdown'))

WebUI.waitForElementPresent(findTestObject('Create new product (OMS)/0010 select storage type dropdown'), 0)

WebUI.click(findTestObject('Create new product (OMS)/0011 select one storage type'))

WebUI.click(findTestObject('Create new product (OMS)/0012 publish product button'))

if (needClose) {
    WebUI.closeBrowser()
}

