package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrL = "https://demo.nopcommerce.com/";

    // call browser setup method from BaseTest class
    @Before
    public void setup() {
        openBrowser(baseUrL);
    }
    @Test

    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the Login link
        driver.findElement(By.linkText("Log in")).click();
        // Verify the text ‘Welcome, Please Sign In'

        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("Not directed to Login page", expectedText, actualText);
    }
        @Test

    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){
        // click on the 'Login' Link
        driver.findElement(By.linkText("Log in")).click();
        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("prime1@gmail.com");
        // Enter valid password
        driver.findElement(By.id("Password")).sendKeys("prime1");
        // Click on ‘LOGIN’ button
        driver.findElement(By.linkText("Log in")).click();
        // Verify the ‘Log in’ text is display
        String expectedText = "Log in";
        String actualText = driver.findElement(By.xpath("//a[@class='ico-login']")).getText();
        Assert.assertEquals("not correct",actualText,expectedText);
   }
    @Test

    public void verifyTheErrorMessage() {
        // click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        // Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("pime123@gmail.com");
        // Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("pime123");
        // Click on Login button
        driver.findElement(By.linkText("Log in")).click();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals("Login was unsuccessful.\n" +
                "Please correct the errors and try again. No customer account found",expectedText,actualText);

    }

    // close browser after Login Test
  @After
   public void tearDown() {
        closeBrowser();
    }

}
