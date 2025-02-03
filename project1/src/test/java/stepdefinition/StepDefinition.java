package stepdefinition;
import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        System.out.println("the user is on the login page");
    }

    @When("the user enters valid username and password")
    public void user_enters_credentials() {
      System.out.println("the user enters valid username and password");
    }

}

