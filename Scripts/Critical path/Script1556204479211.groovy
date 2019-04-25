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

WebUI.selectOptionByValue(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/select_Select01020304050607080'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/select_SelectJanuary - 01Febru'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/select_Select20182017201620152'), 
    '1917', true)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/button_Verify'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/span_CONFIRM AND ACKNOWLEDGE_c'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/button_CONFIRM'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/button_Start Browsing'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/h3_Cannabis'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store  Ontari/span_Indica Dominant'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Indica Dominant Dried Flower/h3_Shishkaberry'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/label_1g'))

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/button_Add to Bag9.75'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/i_9.75_icon icon--back js-clos'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/label_3.5g'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/button_Add to Bag32.40'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/span_concat(I confirm that I'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/span_Accept the_checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Shishkaberry  Ontario Cannabis/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Email_checkoutemail'), 
    'suman@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_First name_checkoutshipp'), 
    'suman')

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Last name_checkoutshippi'), 
    'kompelly')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Address_checkoutshipping'), 
    '399 saint alxendre')

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Apartment suite etc. (op'), 
    '399')

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_City_checkoutshipping_ad'), 
    'montreal')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Postal code_checkoutship'), 
    'm4b1b5')

WebUI.setText(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/input_Phone_checkoutshipping_a'), 
    '(514) 449-3883')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/critical path _OR/Page_Ontario Cannabis Store - Infor/button_Continue to shipping me'))

WebUI.delay(2)

WebUI.click(findTestObject('critical path _OR/Page_Ontario Cannabis Store - Shipp/button_Continue to payment met'))

WebUI.delay(2)

