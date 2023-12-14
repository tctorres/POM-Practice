package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id="user-name")
    private WebElement username;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="login-button")
    private WebElement loginBtn;
    @FindBy(xpath = ".//h3[@data-test='error']")
    private WebElement errorMessage;

    public void enterData(String user, String passwd){
        this.username.sendKeys(user);
        this.password.sendKeys(passwd);
    }
    public void clickOnLogin(){
        this.loginBtn.click();
    }

    public String getLoginErrorMessage(){
        return this.errorMessage.getText();
    }

    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

}
