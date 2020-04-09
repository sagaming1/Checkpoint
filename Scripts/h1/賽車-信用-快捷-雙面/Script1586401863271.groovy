import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://h1-game.rg-play.com/LotteryGame/Zcai')

WebUI.scrollToElement(findTestObject('h1/play'), 0)

WebUI.waitForElementClickable(findTestObject('h1/play'), 0)

WebUI.click(findTestObject('h1/play'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementClickable(findTestObject('Lotto/Lob'), 0)

WebUI.click(findTestObject('Lotto/Lob'))

WebUI.click(findTestObject('Lotto/car'))

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('Lotto/iframe'), 0)

WebUI.click(findTestObject('Lotto/credit'))

WebUI.waitForElementClickable(findTestObject('Lotto/fastmode'), 0)

WebUI.scrollToElement(findTestObject('Lotto/fastmode'), 0)

WebUI.click(findTestObject('Lotto/fastmode'))

WebDriver myDriver = DriverFactory.getWebDriver()

//tr[@class='credit_bet_tr']//ul[@class='ballList']
elements = myDriver.findElements(By.xpath('//tr[@class=\'credit_bet_tr\']//ul[@class=\'ballList\']'))

println(elements.size())

for (i = 1; i < (elements.size() + 1); i++) {
    //(//tr[@class='credit_bet_tr']//ul[@class='ballList'])[1]//li
    elements2 = myDriver.findElements(By.xpath(('(//tr[@class=\'credit_bet_tr\']//ul[@class=\'ballList\'])[' + i) + ']//li'))

    println(elements2.size())

    for (p = 1; p < (elements2.size() + 1); p++) {
        myDriver.findElement(By.xpath(((('(//tr[@class=\'credit_bet_tr\']//ul[@class=\'ballList\'])[' + i) + ']//li[') + 
                p) + ']')).click()
    }
}

for (i = 1; i < 5; i++) {
    myDriver.findElement(By.xpath(('//td[@id=\'fb_7537_' + i) + '\']')).click()
}

