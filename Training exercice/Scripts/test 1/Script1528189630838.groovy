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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser(null)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://webidetesting9974777-p2000288935trial.dispatcher.hanatrial.ondemand.com/webapp/test/flpSandboxMockServer.html?hc_orionpath=%2Fp2000288935trial%24P2000288935-OrionContent%2Ftraining_exercice_clear_lve_part0&origional-url=flpSandboxMockServer.html&sap-ui-appCacheBuster=..%2F..%2F&sap-ui-xx-componentPreload=off#UI5trainingexercise-display&/TrainingCourseSet/0000000001&042')

selenium.type('id=j_username', 'damien.guazzoni@soprasteria.com')

selenium.type('id=j_password', '')

selenium.doubleClick('logOnFormSubmit')

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(5)

selenium.doubleClick('__item2-application-UI5trainingexercise-display-component---master--li-1')

//verifyEquals('Developpement UI5', selenium.getText('application-UI5trainingexercise-display-component---detail--desc'))
verifyText('application-UI5trainingexercise-display-component---detail--desc', 'Developpement UI5')

verifyEquals('USER2', selenium.getText('__text9-application-UI5trainingexercise-display-component---detail--idProductsTable-0'))

verifyEquals('BOXE', selenium.getText('__text10-application-UI5trainingexercise-display-component---detail--idProductsTable-0'))

selenium.doubleClick('application-UI5trainingexercise-display-component---master--test-select')

selenium.doubleClick('application-UI5trainingexercise-display-component---master--Description')

verifyEquals('ABAP00', selenium.getText('application-UI5trainingexercise-display-component---detail--desc'))

selenium.doubleClick('application-UI5trainingexercise-display-component---master--searchField')

selenium.type('id=application-UI5trainingexercise-display-component---master--searchField-I', 'Developpement UI5')

selenium.doubleClick('application-UI5trainingexercise-display-component---master--searchField-search')

verifyEquals('Developpement UI5', selenium.getText('application-UI5trainingexercise-display-component---detail--desc'))

