package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

    public class LogoutTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test(dataProvider = "personalData")
    public void testValidLogout(String user, String password){
        LoginPage login = getLoginPage();
        login.enterData(user, password);
        login.clickOnLogin();
        HomePage homePage = new HomePage(driver);
        homePage.logout();
        String currentURL = login.getCurrentPageURL();
        softAssert.assertEquals(currentURL, "https://www.saucedemo.com/");
    }

    @Test(dataProvider = "invalidPersonalData")
    public void testInvalidLogout(String user, String password, String errorMessage){
        LoginPage login = getLoginPage();
        login.enterData(user, password);
        login.clickOnLogin();
        String actualErrorMessage = login.getLoginErrorMessage();
        softAssert.assertEquals(errorMessage, actualErrorMessage);
    }
}
