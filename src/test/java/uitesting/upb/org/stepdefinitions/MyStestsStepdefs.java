package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStestsStepdefs {
    @And("^browser is maximized$")
    public void browserIsMaximized() {
        System.out.println(" abc testing");
    }

    @Given("^TEsting data$")
    public void testingData() {
        System.out.println("new 5646565");
    }
}
