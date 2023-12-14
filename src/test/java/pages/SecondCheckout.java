package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondCheckout extends BasePage{
    @FindBy(id="finish")
    private WebElement finishBtn;

    public void finishButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(finishBtn));
        this.finishBtn.click();
    }
    public SecondCheckout(WebDriver driver){
        super(driver);
    }
}
