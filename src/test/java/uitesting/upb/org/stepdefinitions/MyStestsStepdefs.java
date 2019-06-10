package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uitesting.upb.org.handlewebsite.LoadPage;

public class MyStestsStepdefs {
    @And("^browser is maximized$")
    public void browserIsMaximized() {
        System.out.println(" abc testing");
    }

    @Given("^TEsting data$")
    public void testingData() {
        System.out.println("new 5646565");
    }

    @Given("^Account name filled$")
    public void fillAccountName(){
        LoadPage.loadE_WalletHome().fillAccountName("Cuenta1");
    }

    @And("^Account description filled$")
    public void fillAccountDescription(){
        LoadPage.loadE_WalletHome().fillAccountDescription("Salarios");
    }

    @Then("^Click Add Button$")
    public void clickAddButton(){
        LoadPage.loadE_WalletHome().clickAddAccountButton();
    }

    @Given("^Table row selected$")
    public void selectRow(){
        LoadPage.loadE_WalletHome().selectAccountFromTable();
    }

    @Then("^Click Detail Button$")
    public void clickDetailButton(){
        LoadPage.loadE_WalletHome().clickDetailButton();
    }

}
