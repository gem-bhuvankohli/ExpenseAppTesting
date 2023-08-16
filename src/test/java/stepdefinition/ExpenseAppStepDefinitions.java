package stepdefinition;

import implementations.ExpenseAppImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ExpenseAppStepDefinitions {

    @Given("the user opens the Expense Tracking Application")
    public void theUserOpensTheExpenseTrackingApplication() {
        ExpenseAppImplementation.openApplication();
    }

    @When("the user signs up with valid credentials")
    public void theUserSignsUpWithValidCredentials() {
        ExpenseAppImplementation.signUp();
    }

    @Then("verifying if user has successfully registered by verifying that the user lands on the sign in page")
    public void verifyingIfUserHasSuccessfullyRegistered() {
        ExpenseAppImplementation.verifySuccessfulSignUp();
    }

    @When("the user signs in with valid credentials")
    public void theUserSignsInWithValidCredentials() {
        ExpenseAppImplementation.signIn();
    }

    @Then("verifying if user has successfully signed in by verifying that the add expenses button is displayed")
    public void verifyingIfUserHasSuccessfullySignedIn() {
        ExpenseAppImplementation.verifySuccessfulSignIn();
    }

    @Given("the user adds expenses with valid details")
    public void theUserAddsExpensesWithValidDetails() {
        ExpenseAppImplementation.addExpenses();
    }

    @Then("verifying if expense added successfully by validating text of category is displayed after submitting the details")
    public void verifyIfExpenseAddedSuccessfully() {
        ExpenseAppImplementation.verifyExpenseAddedSuccessfully();
    }
}
