import jdk.jfr.StackTrace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class TestSelenium {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrew\\Desktop\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.autorentals.com/");

        WebElement pickup = driver.findElement(By.id("pickup"));
        WebElement pickupDate = driver.findElement(By.id("pickup-date"));
        WebElement dropOffDate = driver.findElement(By.id("dropoff-date"));
        WebElement submitButton = driver.findElement(By.id("find-car-deals"));
        //Remove read only attributes
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].removeAttribute('readonly','readonly')",pickupDate);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].removeAttribute('readonly','readonly')",dropOffDate);
        pickup.sendKeys("Markham, ON");

        pickupDate.clear();
        pickupDate.sendKeys("02/24/2020");
        pickupDate.sendKeys(Keys.TAB);
        dropOffDate.sendKeys("03/26/2020");
        submitButton.click();
        //AddedComment

    }
}