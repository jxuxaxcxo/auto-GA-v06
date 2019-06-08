package uitesting.upb.org.handlewebsite;

import org.junit.Assert;
import org.junit.internal.JUnitSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.e_wallet.E_WalletHome;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.managepage.nasa.NasaHome;
import uitesting.upb.org.managepage.numberBox.NumberBox;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class LoadPage {
    public static Home loadGoogleHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static E_WalletHome loadE_WalletHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new E_WalletHome();
    }

    public static NumberBox loadNumberBox(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new NumberBox();
    }

    public static NasaHome loadNasaHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new NasaHome();
    }



    public static void main(String[] args) {
            NasaHome nasaPage = loadNasaHome().clickAPIListingButton().clickAPIListingButton().clickEarthButton().clickImageryButton();

            System.out.println(nasaPage.getText());
    }


}
