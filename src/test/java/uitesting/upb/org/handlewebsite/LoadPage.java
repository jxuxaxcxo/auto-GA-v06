package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.e_wallet.E_WalletHome;
import uitesting.upb.org.managepage.google.home.Home;
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


    public static void main(String[] args) {
        //loadGoogleHome().searchTextAndClickSearchButton("UPB cochabamba");
        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 1","Cuenta de Trabajo");
        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 2","Cuenta de Familia");
        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 3","Cuenta de Inversiones");


    }


}
