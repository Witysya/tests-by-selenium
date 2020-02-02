package org.viktoriia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTests {

    private ChromeDriver driver;

    @Before
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("TestSuitStarted");
    }

    @Test
    public void accessToPage() {
        System.out.println("FirstTestStarted");
        driver.get("https://www.toolsqa.com/automation-practice-form");
        driver.quit();
        System.out.println("FirstTestEnded");
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }

}
