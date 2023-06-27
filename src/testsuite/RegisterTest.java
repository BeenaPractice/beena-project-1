package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrL = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrL);
    }

    @Test
    // userShouldNavigateToRegisterPageSuccessfully
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        // verify the text 'Register'
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Text not found!", expectedText, actualText);
    }

    @Test
    // userShouldRegisterAccountSuccessfully
    public void userShouldRegisterAccountSuccessfully() throws InterruptedException {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Click on Gender radio button
        driver.findElement(By.xpath("//input[@type = 'radio' and @value = 'F']")).click();

        //Enter the First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mala");

        //Enter the Last Name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Sarang");

        //Select Day Month and Year

        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("March");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1976");

        Thread.sleep(5000);

        //  Enter Email address
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("prime0123@gmail.com");

        // Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("prime123");

        // Enter Confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("prime123");

        // Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        // Verify the text 'Your registration completed
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Not registered successfully", expectedText, actualText);
    }

    @After

    public void tearDown() {
        closeBrowser();
    }


}
