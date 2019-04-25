import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/#/verify-age')

WebUI.selectOptionByValue(findTestObject('Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_Select01020304050607080'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_SelectJanuary - 01Febru'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_Select20182017201620152'), 
    '2004', true)

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/button_Verify'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/span_CONFIRM AND ACKNOWLEDGE_c'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/a_Oops Im actually 19 or older'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_Select01020304050607080'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_SelectJanuary - 01Febru'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/select_Select20182017201620152'), 
    '1940', true)

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/button_Verify'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/span_CONFIRM AND ACKNOWLEDGE_c'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/button_Start Browsing'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/h3_Cannabis'))

WebUI.click(findTestObject('Object Repository/Age gate_OR/Page_Ontario Cannabis Store  Ontari/span_Indica Dominant'))

WebUI.closeBrowser()

