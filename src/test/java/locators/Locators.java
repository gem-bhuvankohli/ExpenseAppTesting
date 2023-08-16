package locators;

import org.openqa.selenium.By;

public class Locators {
    public static final By loginEmail = By.id("io.perfecto.expense.tracker:id/login_email");
    public static final By loginPassword = By.id("io.perfecto.expense.tracker:id/login_password");
    public static final By loginBtn = By.id("io.perfecto.expense.tracker:id/login_login_btn");
    public static final By listAddBtn = By.id("io.perfecto.expense.tracker:id/list_add_btn");

    public static final By signUpName = By.id("io.perfecto.expense.tracker:id/signup_name");
    public static final By signUpEmail = By.id("io.perfecto.expense.tracker:id/signup_email");
    public static final By signUpPassword = By.id("io.perfecto.expense.tracker:id/signup_password");
    public static final By signUpConfirmPassword = By.id("io.perfecto.expense.tracker:id/signup_confirm_password");
    public static final By signUpCurrency = By.id("io.perfecto.expense.tracker:id/signup_currency");
    public static final By signUpCurrencySelect = By.xpath("//*[contains(@text,'INR')]");
    public static final By signUpSaveBtn = By.id("io.perfecto.expense.tracker:id/signup_save_btn");

    public static final By amountSelectBar = By.id("io.perfecto.expense.tracker:id/amount_seek_bar");
    public static final By dateAddBtn = By.id("io.perfecto.expense.tracker:id/add_date");
    public static final By dateSelect = By.xpath("//android.view.View[@content-desc=\"10 August 2023\"]");
    public static final By dateConfirmationBtn = By.id("android:id/button1");
    public static final By expenseCategoryBtn = By.xpath("(//*[contains(@text,'Select')])[1]");
    public static final By expenseSubCategoryBtn = By.xpath("//*[contains(@text,'Shopping')]");
    public static final By addExpenseSaveBtn = By.id("io.perfecto.expense.tracker:id/add_save_btn");

    public static final By categoryTextPostAddingExpense = By.xpath("//*[@text='Shopping']");
}
