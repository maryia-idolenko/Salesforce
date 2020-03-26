package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPages extends BasePage {
    String URL = "https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    public AccountsPages(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountsPages isPageOpened() {
        return this;
    }

    @Override
    public AccountsPages openPage() {
        driver.get(URL);
        return this;
    }

    public AccountsPages clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        return this;
    }

    public ContactsPages createAccount() {
        new DropDown("Type").selectValue(driver, "Reseller");
        new TextArea("Description").write(driver, "Description Test Text");
        new Input("Account Name").write(driver, "Name of account");
        new Input("Website").write(driver, "onliner.by");
        new Input("Employees").write(driver, "Test");
        new Input("Billing State/Province").write(driver, "Test");
        new Input("Billing Zip/Postal Code").write(driver, "7545");
        new Input("Billing Country").write(driver, "teszt");
        new Input("Shipping City").write(driver, "Minsk");
        new Input("Shipping State/Province").write(driver, "");
        new Input("Shipping Zip/Postal Code").write(driver, "Name of account");
        new Input("Shipping Country").write(driver, "onliner.by");
        driver.findElement(By.xpath("//div[contains(@class,'isModal')]//*[text()='Save']")).click();
        return new ContactsPages(driver);
    }
}