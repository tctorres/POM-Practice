package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends BasePage{
@FindBy(id="checkout")
private WebElement checkoutBtn;
@FindBy(id="remove-sauce-labs-backpack")
private WebElement removeProduct1;
@FindBy(id="remove-sauce-labs-bike-light")
private WebElement removeProduct2;
@FindBy(id="remove-sauce-labs-bolt-t-shirt")
private  WebElement removeProduct3;
@FindBy(className = "cart_item")
private List<WebElement> cartItemsList;

public void checkout(){
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
    this.checkoutBtn.click();
}
public void removeProducts(){
    this.removeProduct1.click();
    this.removeProduct2.click();
    this.removeProduct3.click();
}
public int getCartItemsCount() {
    return this.cartItemsList.size();
}
    public CartPage(WebDriver driver){
        super(driver);
    }


}

