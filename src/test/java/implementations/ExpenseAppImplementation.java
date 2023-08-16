package implementations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import locators.Locators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ExpenseAppImplementation {
    public static AppiumDriver driver;

    /**
     * Opens the Expense Tracking Application.
     */
    public static void openApplication() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", ConfigReader.getProperty("appium.deviceName"));
            cap.setCapability("udid", ConfigReader.getProperty("appium.udid"));
            cap.setCapability("platformName", ConfigReader.getProperty("appium.platformName"));
            cap.setCapability("app", System.getProperty("user.dir") + ConfigReader.getProperty("appium.appPath"));

            URL url = new URL(ConfigReader.getProperty("appium.appUrl"));
            driver = new AndroidDriver(url, cap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Signs up with valid credentials.
     */
    public static void signUp() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement signUpBtn = driver.findElement(By.id("io.perfecto.expense.tracker:id/login_signup_btn"));
            signUpBtn.click();

            WebElement signUpName = driver.findElement(Locators.signUpName);
            signUpName.sendKeys("abcdef");

            WebElement signUpEmail = driver.findElement(Locators.signUpEmail);
            signUpEmail.sendKeys("abcdef@gmail.com");

            WebElement signUpPassword = driver.findElement(Locators.signUpPassword);
            signUpPassword.sendKeys("qwerty123");

            WebElement signUpConfirmPassword = driver.findElement(Locators.signUpConfirmPassword);
            signUpConfirmPassword.sendKeys("qwerty123");

            WebElement signUpCurrency = driver.findElement(Locators.signUpCurrency);
            signUpCurrency.click();

            WebElement signUpCurrencySelect = driver.findElement(Locators.signUpCurrencySelect);
            signUpCurrencySelect.click();

            WebElement signUpSaveBtn = driver.findElement(Locators.signUpSaveBtn);
            signUpSaveBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Verifies successful sign-up by checking for the presence of the login email field.
     */
    public static void verifySuccessfulSignUp() {
        try {
            WebElement verifyIfLoginEmailFieldIsPresent = driver.findElement(Locators.loginEmail);
            Assert.assertTrue(verifyIfLoginEmailFieldIsPresent.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Signs in with valid credentials.
     */
    public static void signIn() {
        try {
            WebElement loginEmail = driver.findElement(Locators.loginEmail);
            loginEmail.sendKeys("abcdef@gmail.com");

            WebElement loginPassword = driver.findElement(Locators.loginPassword);
            loginPassword.sendKeys("qwerty123");

            WebElement loginBtn = driver.findElement(Locators.loginBtn);
            loginBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Verifies successful sign-in by checking for the presence of the "Add" button on the list screen.
     */
    public static void verifySuccessfulSignIn() {
        try {
            WebElement verifyIfListAddBtnIsPresent = driver.findElement(Locators.listAddBtn);
            Assert.assertTrue(verifyIfListAddBtnIsPresent.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds expenses with valid details.
     */
    public static void addExpenses() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement listAddBtn = driver.findElement(Locators.listAddBtn);
            listAddBtn.click();

            WebElement expenseCategoryBtn = driver.findElement(Locators.expenseCategoryBtn);
            expenseCategoryBtn.click();

            WebElement expenseSubCategoryBtn = driver.findElement(Locators.expenseSubCategoryBtn);
            expenseSubCategoryBtn.click();

            WebElement amountSelectBar = driver.findElement(Locators.amountSelectBar);
            TouchAction action = new TouchAction<>((PerformsTouchActions) driver);
            action.longPress(ElementOption.element(amountSelectBar)).moveTo(ElementOption.element(amountSelectBar, 250, 250)).release().perform();

            WebElement dateAddBtn = driver.findElement(Locators.dateAddBtn);
            dateAddBtn.click();

            WebElement dateSelect = driver.findElement(Locators.dateSelect);
            dateSelect.click();

            WebElement dateConfirmationBtn = driver.findElement(Locators.dateConfirmationBtn);
            dateConfirmationBtn.click();

            WebElement addExpenseSaveBtn = driver.findElement(Locators.addExpenseSaveBtn);
            addExpenseSaveBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Verifies that an expense was added successfully by checking the category text post-adding an expense.
     */
    public static void verifyExpenseAddedSuccessfully() {
        try {
            String categoryTextPostAddingExpense = driver.findElement(Locators.categoryTextPostAddingExpense).getText();
            Assert.assertEquals(categoryTextPostAddingExpense, "Shopping");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}