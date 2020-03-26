package pages;

import elements.Input;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPages extends BasePage {
    String URL = "https://ap16.lightning.force.com/lightning/o/Contact/list?filterName=Recent";

    public ContactsPages(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactsPages isPageOpened() {
        return this;
    }

    @Override
    public ContactsPages openPage() {
        driver.get(URL);
        return this;
    }

    public ContactsPages clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        return this;
    }

    public ContactsPages createContact() {
        new TextArea("Mailing Street").write(driver, "Mailing Street Test Text");
        new TextArea("Other Street").write(driver, "Other Street Text");
        new TextArea("Description").write(driver, "Description Text");
        new Input("Phone").write(driver, "5665856552");
        new Input("Mobile").write(driver, "4545454545");
        new Input("First Name").write(driver, "First Test");
        new Input("Last Name").write(driver, "Last Test");
        new Input("Email").write(driver, "testqa@test.com");
        new Input("Title").write(driver, "Title Test");
        new Input("Mailing City").write(driver, "Minsk");
        new Input("Mailing Zip/Postal Code").write(driver, "45545");
        new Input("Fax").write(driver, "45555525");
        new Input("Department").write(driver, "Department Test");
        new Input("Home Phone").write(driver, "1212524145");
        driver.findElement(By.xpath("//div[contains(@class,'isModal')]//*[text()='Save']")).click();
        return this;
    }
}