import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('h1/play'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Lotto/Lob'))

WebUI.click(findTestObject('Lotto/car'))

WebUI.switchToFrame(findTestObject('Lotto/iframe'), 0)

WebUI.click(findTestObject('Lotto/credit'))

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

