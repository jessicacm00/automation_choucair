package stepdefinitions;

import tasks.PerformLogin;
import tasks.AddCandidate;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;



    public class RecruitmentSteps {


    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        theActorInTheSpotlight().attemptsTo(
                PerformLogin.withCredentials("Admin", "admin123")
        );
    }

    @When("the user adds a new candidate with first name {string}, last name {string}, and email {string}")
    public void theUserAddsANewCandidate(String firstName, String lastName, String email) {
        theActorInTheSpotlight().attemptsTo(
                AddCandidate.withDetails(firstName, lastName, email)
        );
    }

    @Then("the candidate should be added successfully with status {string}")
    public void theCandidateShouldBeAddedSuccessfully(String status) {
        // Add validation logic here
    }
}