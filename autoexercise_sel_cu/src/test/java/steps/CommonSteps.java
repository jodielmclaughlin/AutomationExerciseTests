package steps;

import java.io.ObjectInputFilter.Config;

import org.junit.jupiter.api.Assertions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import shared.TestContext;

public class CommonSteps {
    private final TestContext testContext;

    public CommonSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    

    @Given ("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        HomePage homePage = new HomePage(testContext.getDriver());
        LoginPage loginPage = homePage.clickLoginButton();

        loginPage.typeInLoginEmailInput(ConfigReader.standardEmail());
        loginPage.typeInLoginPasswordInput(ConfigReader.standardPassword());
        loginPage.userClicksLoginButton();

        Assertions.assertTrue(homePage.isLoggedIn(), "I couldn't find the Logout button..");
    }

    
}
