import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

Thread.sleep(3000)

WebUI.mouseOver(findTestObject('Lotto/Lob'))

Thread.sleep(2000)

WebUI.click(findTestObject('Lotto/car'))

WebUI.maximizeWindow()

WebUI.switchToFrame(findTestObject('Lotto/iframe'), 0)

WebUI.waitForElementClickable(findTestObject('Lotto/credit'), 0)

WebUI.click(findTestObject('Lotto/credit'))

WebUI.waitForElementClickable(findTestObject('CarObj/第1-10名'), 0)

WebUI.click(findTestObject('CarObj/第1-10名'))

WebUI.waitForElementClickable(findTestObject('Lotto/fastmode'), 0)

WebUI.scrollToElement(findTestObject('Lotto/fastmode'), 0)

WebUI.click(findTestObject('Lotto/fastmode'))

WebDriver myDriver = DriverFactory.getWebDriver()

//tr[@class='credit_bet_tr']//ul[@class='ballList']
elements = myDriver.findElements(By.xpath('//li[@class=\'pickclass\']'))

println(elements.size())

for (i = 1; i < (elements.size() + 1); i++) {
    if (i == 50) {
        WebElement element = myDriver.findElement(By.xpath('(//li[@class=\'pickclass\'])'))

            ((myDriver) as JavascriptExecutor).executeScript('arguments[0].scrollIntoView(true);', element)

        Thread.sleep(500)
    }
    
    myDriver.findElement(By.xpath('(//li[@class=\'pickclass\'])')).click()
}

