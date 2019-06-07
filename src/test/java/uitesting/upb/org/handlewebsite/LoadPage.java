package uitesting.upb.org.handlewebsite;

import org.junit.Assert;
import org.junit.internal.JUnitSystem;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.e_wallet.E_WalletHome;
import uitesting.upb.org.managepage.google.home.Home;
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



    public static void main(String[] args) {
        //loadGoogleHome().searchTextAndClickSearchButton("UPB cochabamba");

//        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 1","Cuenta de Trabajo");
//        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 2","Cuenta de Familia");
//        loadE_WalletHome().fillAccountDataAndAddAccount("Cuenta 3","Cuenta de Inversiones");


        //PARTICION1
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(-100),"Value Rejected");

        //PARTICION2
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(500),"Value Accepted");

        //PARTICION3
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(1500),"Value Rejected");

        //BORDE1
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(0),"Value Rejected");
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(1),"Value Accepted");
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(2),"Value Accepted");

        //BORDE2
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(999),"Value Accepted");
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(1000),"Value Accepted");
        Assert.assertEquals(loadNumberBox().fillInputAndCheckNumber(1001),"Value Rejected");
    }


}
