package stepdifinition2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SecondStepDef {


    @And("clicks the login button")
    public void user_clicks_login() {
    	System.out.println("clicks the login button");
    }

    @Then("the user should be redirected to the home page")
    public void user_redirected_to_home() {
        System.out.println("the user should be redirected to the home page");
    }
}
