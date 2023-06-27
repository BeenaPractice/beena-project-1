package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";


    // call browser setup method
    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    //  userShouldNavigateToComputerPageSuccessfully
    public void userShouldNavigateToComputerPageSuccessfully() {

        // click on the ‘Computers’ Tab

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);
    }

    @Test
    // userShouldNavigateToElectronicsPageSuccessfully
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // click on the ‘Electronics’ Ta
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);
    }
    @Test
    // userShouldNavigateToApparelPageSuccessfully
    public void userShouldNavigateToApparelPageSuccessfully(){
       // click on the ‘Apparel’ Tab
       driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
       // Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);

    }
    @Test
    // userShouldNavigateToDigitalDownloadsPageSuccessfully
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);
    }
    @Test

    // userShouldNavigateToBooksPageSuccessfully
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        // Verify the text ‘Books’
        String expectedText = "Books";
        String actualText=driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);
    }
    @Test
    // userShouldNavigateToJewelryPageSuccessfully
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        // Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);

    }
    @Test
    // userShouldNavigateToGiftCardsPageSuccessfully
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        // Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Is Not as Expected", expectedText, actualText);
    }
    @After

    public void tearDown(){
        closeBrowser();
    }

}
