package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.PastebinPage;

public class PastebinTest {



        public static PastebinPage pastebinPage;
        public static WebDriver driver;


        @BeforeClass
        public static void setup () {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(ConfProperties.getProperty("landingPageUrl"));
        }

        @Test
        public void pastebinTest () {

            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-text")));
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("select2-postform-expiration-container")));
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-name")));
            new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));

            pastebinPage.pasteCode("Hello from WebDriver");
            pastebinPage.openDropdown();
            pastebinPage.selectExpirationTime("10 Minutes");
            pastebinPage.pasteNameInput("helloweb");
            pastebinPage.submitPaste();

            /*
            pastebinPage.pasteCode(ConfProperties.getProperty("pasteCodeValue"));
            pastebinPage.openDropdown();
            pastebinPage.selectExpirationTime(ConfProperties.getProperty("pasteExpirationValue"));
            pastebinPage.pasteNameInput(ConfProperties.getProperty("pasteNameValue"));
            pastebinPage.submitPaste();
            */

        }
       // @AfterClass
       // public static void tearDown () {
       //     driver.quit();
       // }

    }




    /*public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver(); //создаём новый инстанс для вебдрайвера

            driver.get("https://pastebin.com/"); //открываем нужную страницу

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-text")));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("select2-postform-expiration-container")));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-name")));
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));

        WebElement pasteCodeField = driver.findElement(By.id("postform-text")); //done
        pasteCodeField.sendKeys("Hello from WebDriver");

        WebElement dropDownBtn = driver.findElement(By.id("select2-postform-expiration-container")); //done
        dropDownBtn.click();


        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("select2-postform-expiration-results")));
        WebElement expirationOption = driver.findElement(By.xpath("//li[text()[contains(.,'10 Minutes')]]")); //done
        expirationOption.click();

                WebElement pasteName = driver.findElement(By.id("postform-name")); //done
        pasteName.sendKeys("helloweb");

        WebElement pasteBtn = driver.findElement(By.xpath("//button[@type='submit']")); //done
        pasteBtn.click();

        Thread.sleep(10000); //пауза на посмотреть
        driver.quit(); //закрываем инстанс

        //}

    }*/

