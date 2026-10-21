package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By loginButton = By.xpath("a[href='/login']");
    private final By productsButton = By.xpath("a[href= '/products']");
    private final By cartButton = By.xpath("a[href= '/view_cart']");
    private final By contactUsButton = By.xpath("a[href= /contact_us']");
    private final By homeButton = By.xpath("a[href= /']");
    private final By searchInput = By.id("search_product");
    private final By searchButton = By.id("submit_search");
    private final By addToCartButton = By.id("1");
    private final By viewProductButton = By.xpath("a[href= '/product_details/5']");
    private final By loggedInUser = By.className("fa fa-user");
    private final By arrowUpButton = By.className("fa fa-angle-up");
    private final By subscriptionInput = By.id("subscribe_email");
    private final By logoutButton = By.xpath("a[href= '/logout']");
    private final By deleteAccountButton = By.xpath("a[href= '/delete_account']");
//    private final By womanCategoryButton = By.xpath("a[href= '#Women']");


    public LoginPage clickLoginButton() {
        click(loginButton);
        return new LoginPage(driver);
    }

    public void clickLogoutButton() {
        click(logoutButton);
    }

    public void clickProductsButton() {
        click(productsButton);
    }

    public void clickCartButton() {
        click(cartButton);
    }

    public void clickContactUsButton() {
        click(contactUsButton);
        // return new ContactUsPage(driver);
    }

    public void clickHomeButton() {
        click(homeButton);
    }

    public void enterSearchText(String text) {
        type(searchInput, text);
    }

    public void clickSearchButton() {
        click(searchButton);
    }

    public void clickAddToCartButton() {
        click(addToCartButton);
    }

    public void clickViewProductButton() {
        click(viewProductButton);
    }

    public boolean isLoggedIn() {
        return waitForVisible(loggedInUser).isDisplayed();
    }

    public void clickarrowUpButton() {
        click(arrowUpButton);
    }

    public void enterSubscriptionInput(String text) {
        type(subscriptionInput, text);
    }

    public void clickDeleteAccountButton() {
        click(deleteAccountButton);
    }

//    public void selectWomanCategory(String category) {
//        click(womanCategoryButton);
//        Select categories = new Select(waitForVisible(womanCategoryButton));
//        categories.selectByVisibleText(category);
//    }
}
    