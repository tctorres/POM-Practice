package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class RemoveElementTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
    @Test(dataProvider = "validUsersForRemoveElements")
        public void removeElementTest(String user, String password){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        LoginPage login = getLoginPage();
        login.enterData(user, password);
        login.clickOnLogin();
        homePage.addProducts();
        homePage.goToShoppingCart();
        cartPage.removeProducts();
        softAssert.assertEquals(cartPage.getCartItemsCount(), 0);
        }
    }

