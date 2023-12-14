package test;

import org.testng.annotations.Test;
import pages.*;

public class PurchaseProductTest extends BaseTest {


@Test(dataProvider = "validDataOfUsers")
    public void purchaseProductTest(String user, String password){
    HomePage homePage = new HomePage(driver);
    FirstCheckout checkout1 = new FirstCheckout(driver);
    CartPage cartPage = new CartPage(driver);
    SecondCheckout checkout2 = new SecondCheckout(driver);
    LoginPage login = getLoginPage();
    login.enterData(user, password);
    login.clickOnLogin();
    homePage.addRandomProductToCart();
    homePage.goToShoppingCart();
    cartPage.checkout();
    checkout1.data("Marco", "Rivas", "0000");
    checkout1.nextBtn();
    checkout2.finishButton();




}

}
