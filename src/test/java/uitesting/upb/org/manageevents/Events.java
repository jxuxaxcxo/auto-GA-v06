package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class Events {
    public static void click(WebElement webElement){
        webElement.click();
    }

    public static void click2(WebElement webElement){

        JavascriptExecutor jsx = (JavascriptExecutor)DriverManager.getInstance().getWebDriver();
        jsx.executeScript("window.scrollBy(0,20000)", "");

        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));

        webElement.click();
    }


    public static void click(By by){

        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }

    public static void selectRow(WebElement table, String xpath){table.findElement(By.xpath(xpath)).isSelected();}
}
