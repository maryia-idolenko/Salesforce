package tests;

import modules.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        User user = new User("idolenkomaria1-wcv9@force.com", "qazQAZ1!");
        loginPage
                .openPage()
                .login(user)
                .openPage()
                .clickNew()
                .createAccount()
                .openPage()
                .clickNew()
                .createContact();
    }
}