package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import shared.TestContext;

public class LoginSteps {

    private final TestContext context;
    private LoginPage loginPage;

    
    public LoginSteps(TestContext context) {
        this.context = context;
    }

    @Given ("user is on the login page")
    public void userIsOnTheLoginPage() {
        loginPage = new HomePage(context.getDriver()).clickLoginButton();
    }
    
    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        loginPage.typeInLoginEmailInput(ConfigReader.standardEmail());
        loginPage.typeInLoginPasswordInput(ConfigReader.standardPassword());
        loginPage.userClicksLoginButton();
    }

    @Then("user should be redirected to the home page")
    public void userShouldBeRedirectedToTheHomePage() {
        HomePage homePage = new HomePage(context.getDriver());
        Assertions.assertTrue(homePage.isLoggedIn());
        assertEquals("https://www.automationexercise.com/", context.getDriver().getCurrentUrl());
    }
    @Then("user should see {string} message")
    public void userShouldSeeMessage(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters invalid username and password")
    public void userEntersInvalidUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on the login button")
    public void clicksOnTheLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on the logout button")
    public void userClicksOnTheLogoutButton() {
        
    }
    
    @Then("user should be redirected to the login page")
    public void userShouldBeRedirectedToTheLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
