package org.viktoriia;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleTests {

    private static ChromeDriver driver;

    @BeforeClass
    public static void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form");
        driver.manage().window().maximize();
        System.out.println("TestSuitStarted");
    }

    @Test
    public void accessToPage() {
        System.out.println("FirstTestStarted");
        System.out.println("FirstTestEnded");
    }

    @Test
    public void clickPartialLink() {
        driver.findElementByPartialLinkText("Partial Link Test").click();
        System.out.println("PartialLink Test Finished");
        driver.navigate().back();
    }

    @Test
    public void clickLink() {
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link Test Finished");
        driver.navigate().back();
    }

    @Test
    public void enterFirstName() {
        driver.findElement(By.name("firstname")).sendKeys("Vicky");
        System.out.println("FirstName Test Finished");
    }

    @Test
    public void enterLastName() {
        driver.findElement(By.id("lastname")).sendKeys("Hord");
        System.out.println("LastName Test Finished");
    }

    @Test
    public void selectExperience() {
        WebElement Experience = driver.findElement(By.xpath("//input[@id='exp-1']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Experience);
    }

    @Test
    public void enterDate() {
        driver.findElement(By.id("datepicker")).sendKeys("11/11/11");
        System.out.println("Date is entered");
    }

    @Test
    public void selectProffesion() {
        WebElement Proffesion = driver.findElement(By.xpath("//input[@id='profession-0']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", Proffesion);
    }

    @Test
    public void clickSimpleButton() {
        WebElement SimpleButton = driver.findElement(By.id("buttonwithclass"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SimpleButton);
    }

    @Test
    public void radioButtonTest() {
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='sex-0']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", radioButton);
    }

    @Test
    public void uploadDocument() {
        WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
        upload.sendKeys("C:\\Users\\vhord\\Pictures\\image.png");
    }
/*** загрузка файлу на компютер */


    @Test
    public void automationTool() {
        WebElement AutomationTool = driver.findElement(By.xpath("//input[@id='tool-2']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", AutomationTool);
    }

    @Test
    public void continentsTest() {
        Select drpContinents = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
        drpContinents.selectByVisibleText("Europe");
    }

    @Test
    public void multipleSelect() {
        Select dropMultiple = new Select(driver.findElementByXPath("//select[@id='continentsmultiple']"));
        dropMultiple.selectByValue("NA");
    }

    @Test
    public void seleniumCommands() {
        Select seleniumCommands = new Select(driver.findElementByXPath("//select[@id='selenium_commands']"));
        seleniumCommands.selectByVisibleText("Navigation Commands");
    }

    @Test
    public void clickingOnFirst() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement FirstButton = driver.findElement(By.xpath("//button[@id='submit']"));


        executor.executeScript("arguments[0].click();", FirstButton);
    }

    @Test
    public void clickingOnSecond() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement SecondButton = driver.findElement(By.xpath("//button[@id='submit1']"));
        executor.executeScript("arguments[0].click();", SecondButton);
    }

    @Test
    public void clickingOnThird() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement Thirdbutton = driver.findElement(By.xpath("//button[@id='submit2']"));
        executor.executeScript("arguments[0].click();", Thirdbutton);
    }

    @Test
    public void clickingOnLast() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        WebElement LastButton = driver.findElement(By.xpath("//button[@id='submit3']"));
        executor.executeScript("arguments[0].click();", LastButton);
    }
    @Test
    public void checkText(){

    }
}
