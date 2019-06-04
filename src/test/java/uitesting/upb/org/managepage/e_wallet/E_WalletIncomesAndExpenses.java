package uitesting.upb.org.managepage.e_wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class E_WalletIncomesAndExpenses extends BasePage {


    @FindBy(xpath ="//*[@id=\"buttonAddIncome\"]")
    private WebElement addIncomeButton;


}
