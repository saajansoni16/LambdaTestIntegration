package LambdaTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest extends LambdaTestNGTest {

    @Test(priority = 0)
    public void searchEpam(){
        driver.findElement(By.name("q")).sendKeys("EPAM");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='Ftghae']/div[2]/h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='Ftghae']/div[2]/h2/span")).getText();
        Assert.assertEquals(title, "EPAM Systems");
    }

    @Test(priority = 1)
    public void searchIndore(){
        driver.findElement(By.name("q")).sendKeys("Indore");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).getText();
        Assert.assertEquals(title, "Indore");
    }

    @Test(priority = 2)
    public void searchPune(){
        driver.findElement(By.name("q")).sendKeys("Pune");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).isDisplayed();
        String title = driver.findElement(By.xpath("//div[@class='fYOrjf kp-hc']/descendant::h2/span")).getText();
        Assert.assertEquals(title, "Punee");
    }
}
