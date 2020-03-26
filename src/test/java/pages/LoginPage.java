package pages;

import modules.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage isPageOpened() {
        return this;
    }

    @Override
    public LoginPage openPage() {
        driver.get("https://login.salesforce.com/");
        isPageOpened();
        return this;
    }

    public AccountsPages login(User user) {
        driver.findElement(By.id("username")).sendKeys(user.getUsername());
        driver.findElement(By.id("password")).sendKeys(user.getPassword());
        driver.findElement(By.id("Login")).click();
        return new AccountsPages(driver);
    }
}