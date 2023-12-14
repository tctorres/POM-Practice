package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pages.LoginPage;

public class BaseTest{
    WebDriver driver = null;

    @BeforeTest
    public void beforeTest(){
        String driverPath = "C:\\Users\\tania.torres\\IdeaProjects\\pom-practice\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }
    @DataProvider(name="personalData")
    public Object [][] getPersonalData(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"}

        };
    }

    @DataProvider(name="invalidPersonalData")
    public Object [][] getInvalidPersonalData(){
        return new Object[][] {
            {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."}
        };
    }

    @DataProvider(name="validDataOfUsers")
    public Object [][] getValidDataOfUsers(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"}
        };
    }
    @DataProvider(name="validUsersForRemoveElements")
    public Object [][] getValidUsersForRemoveElements(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"visual_user", "secret_sauce"}
        };
    }

   @AfterTest
    public void afterTest() {
        driver.close();
    }

    public LoginPage getLoginPage(){
        return new LoginPage(driver, "https://www.saucedemo.com/");
    }
}