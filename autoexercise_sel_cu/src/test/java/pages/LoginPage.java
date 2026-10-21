package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By emailInputLogin =  By.cssSelector("[data-qa='login-email']");
    private By passwordInputLogin =  By.cssSelector("[data-qa='login-password']");
    private By loginBtn =  By.cssSelector("[data-qa='login-button']");
    private By loginError =  By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p");
    private By nameInputSignUp =  By.cssSelector("[data-qa='signup-name']");
    private By emailInputSignUp =  By.cssSelector("[data-qa='signup-email']");
    private By signUpBtn =  By.cssSelector("[data-qa='signup-button']");
    private By signUpError =  By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

     public void typeInLoginEmailInput(String email){
        type(emailInputLogin, email);
    }

    public void typeInLoginPasswordInput(String password){
        type(passwordInputLogin, password);
    }

    public void userClicksLoginButton(){
        click(loginBtn);
    }

    public String getLoginErrorMessage(){
        return textOf(loginError);
    }

    public void typeInSignUpEmailInput(String email){
        type(emailInputSignUp, email);
    }

    public void typeInSignUpNameInput(String name){
        type(nameInputSignUp, name);
    }

    public SignUpPage userClicksSignUpButton(){
        click(signUpBtn);
        return new SignUpPage(driver);
    }
}
