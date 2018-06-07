import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webidetesting9974777-p2000288935trial.dispatcher.hanatrial.ondemand.com/webapp/test/flpSandboxMockServer.html?hc_orionpath=%2Fp2000288935trial%24P2000288935-OrionContent%2Ftraining_exercice_clear_lve_part0&origional-url=flpSandboxMockServer.html&sap-ui-appCacheBuster=..%2F..%2F&sap-ui-xx-componentPreload=off#UI5trainingexercise-display&/TrainingCourseSet/0000000001&042')

WebUI.delay(1)

WebUI.setText(findTestObject('test 3/Page_SAP Cloud Platform Ouvrir une/input_j_username'), 'damien.guazzoni@soprasteria.com')

WebUI.setText(findTestObject('test 3/Page_SAP Cloud Platform Ouvrir une/input_j_password'), 'mdp')

WebUI.click(findTestObject('test 3/Page_SAP Cloud Platform Ouvrir une/button_Ouvrir une session'))

WebUI.delay(10)

WebUI.refresh()

WebUI.click(findTestObject('test 3/Page_UI5 training exercise/div_Developpement UI5'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('test 4/Page_UI5 training exercise/span_Developpement UI5_1'), 'Developpement UI5')

WebUI.verifyElementText(findTestObject('test 4/Page_UI5 training exercise/span_USER2'), 'USER2')

WebUI.verifyElementText(findTestObject('test 4/Page_UI5 training exercise/span_BOXE'), 'BOXE')

WebUI.setText(findTestObject('test 4/Page_UI5 training exercise/input_application-UI5traininge'), 'Creat')

WebUI.click(findTestObject('test 4/Page_UI5 training exercise/div_application-UI5trainingexe'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('test 4/Page_UI5 training exercise/span_Creation Web Service'), 'Creation Web Service')

WebUI.click(findTestObject('test 4/Page_UI5 training exercise/div_application-UI5trainingexe - Copy'))

WebUI.click(findTestObject('test 4/Page_UI5 training exercise/div_Default sort  id'))

WebUI.click(findTestObject('test 4/Page_UI5 training exercise/li_Sort by description'))

WebUI.verifyElementText(findTestObject('test 4/Page_UI5 training exercise/span_ABAP00'), 'ABAP00')

WebUI.closeBrowser()

