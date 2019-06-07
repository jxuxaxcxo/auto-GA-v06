package uitesting.upb.org.managepage.e_wallet;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;



public class E_WalletHome extends BasePage {

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement accountName;

    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement accountDescription;

    @FindBy(xpath = "//*[@id=\"buttonAdd\"]")
    private WebElement addAccountButton;

    @FindBy(xpath = "//*[@id=\"__BVID__35\"]")
    private WebElement accountsTable;

    public E_WalletHome accountNameAndDescription(String text1, String text2){
        Events.fillField(accountName, text1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Events.fillField(accountDescription, text2);

        return this;
    }

    public void clickAddAccountButton(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Events.click(addAccountButton);
    }

    public void selectAccountFromTable(){
        Events.selectRow(accountsTable,"//*[@id=\"__BVID__35\"]/tbody/tr");
    }
    public void clickDetailButton(){Events.click(addAccountButton);}

    public E_WalletHome fillAccountDataAndAddAccount(String accountName, String accountDescription){
        accountNameAndDescription(accountName,accountDescription).clickAddAccountButton();

        return this;
    }


    public void seeAccountDetails(){
        selectAccountFromTable();
        clickDetailButton();
    }

}
