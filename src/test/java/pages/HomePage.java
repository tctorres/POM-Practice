package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addProduct1ToCart;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addProduct2ToCart;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addProduct3ToCart;
    @FindBy(className = "inventory_item")
    private List<WebElement> productsList;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;
    @FindBy(id="logout_sidebar_link")
    private WebElement logoutLink;

    public void logout(){
        this.menuBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(logoutLink));
        this.logoutLink.click();

    }
    public void addProducts(){
        this.addProduct1ToCart.click();
        this.addProduct2ToCart.click();
        this.addProduct3ToCart.click();
    }
    public void addRandomProductToCart(){
        int randomProductIndex = new Random().nextInt(this.productsList.size());
        WebElement addToCartButton = this.productsList.get(randomProductIndex).findElement(By.tagName("button"));
        addToCartButton.click();
    }
    public void goToShoppingCart(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(shoppingCart));
        this.shoppingCart.click();

    }
    public void menuButton(){
        this.menuBtn.click();
    }
    public HomePage(WebDriver driver){
        super(driver);

    }

}
