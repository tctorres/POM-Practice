package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstCheckout extends BasePage{
    @FindBy(id="first-name")
    private WebElement firstName;
    @FindBy(id="last-name")
    private WebElement lastName;
    @FindBy(id="postal-code")
    private WebElement postalCd;
    @FindBy(id="continue")
    private WebElement continueBtn;

    public void data(String name, String lastNm, String postalCode){
        this.firstName.sendKeys(name);
        this.lastName.sendKeys(lastNm);
        this.postalCd.sendKeys(postalCode);
    }
    public void nextBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        this.continueBtn.click();
    }
    public FirstCheckout(WebDriver driver){
        super(driver);
    }
}
