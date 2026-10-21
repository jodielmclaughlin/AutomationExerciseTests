package steps;

import pages.LoginPage;
import shared.TestContext;

public class SignUpSteps {
    private final TestContext testContext;
    private final LoginPage loginPage;

    public SignUpSteps(TestContext testContext) {

        this.testContext = testContext;
        this.loginPage = new LoginPage(testContext.getDriver());

    }




    
}