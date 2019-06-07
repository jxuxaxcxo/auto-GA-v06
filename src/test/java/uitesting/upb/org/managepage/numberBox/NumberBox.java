package uitesting.upb.org.managepage.numberBox;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class NumberBox extends BasePage {

    @FindBy(xpath = "//*[@id=\"numberInputField\"]")
    private WebElement numberInput;

    @FindBy(xpath = "//*[@id=\"checkNumberButton\"]")
    private WebElement checkNumberButton;

    @FindBy(xpath = "//*[@id=\"statusDisplay\"]")
    private WebElement statusDisplay;


    public NumberBox fillNumberInput(int number){
        Events.fillField(numberInput,number+"");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public void clickCheckNumberButton(){Events.click(checkNumberButton);}

    public String fillInputAndCheckNumber(int number){
        fillNumberInput(number).clickCheckNumberButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return statusDisplay.getText();
    }




}
