package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class NasaHome extends BasePage {


    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaAPIListingButton;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/li/a")
    private WebElement earthButton;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul/li[1]/a")
    private WebElement imageryButton;


    @FindBy(xpath = "/html/body/div[2]/div[2]/p[57]/code")
    private WebElement imageryText;


    public NasaHome clickAPIListingButton(){
        Events.click(nasaAPIListingButton);
        return this;
    }


    public NasaHome clickEarthButton(){


        Events.click2(earthButton);
        return this;
    }

    public NasaHome clickImageryButton(){
        Events.click(imageryButton);
        return this;
    }

    public String getText(){
       return imageryText.getText();
    }




}
