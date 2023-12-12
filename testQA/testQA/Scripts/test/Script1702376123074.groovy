import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import com.kms.katalon.core.testobject.ConditionType
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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://stage.mobipaid.com/de/register')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="lang-sm lang-lbl"]'))
WebUI.delay(2)
WebUI.scrollToElement(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="switch-lang"]/*[@class="lang-xs lang-lbl uppercase-spaced" and @lang="en"]'),30)

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@class="switch-lang"]/*[@class="lang-xs lang-lbl uppercase-spaced" and @lang="en"]'))
WebUI.delay(10)

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="signatory_first_name"]'), 'Julianto')
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="signatory_last_name"]'), 'Anto')
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="email"]'), 'juliantono1234@gmail.com')
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="password"]'), 'Jakarta123!')
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="name"]'), 'PT')
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@type="tel"]'), '81323121223')
WebUI.delay(2)
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="country"]'))
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@data-iso="is"]'))
WebUI.delay(2)
WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@name="state"]'), 'Jakarta')
WebUI.delay(2)
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@type="checkbox"]'))
WebUI.delay(2)
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="btn-register"]'))

 