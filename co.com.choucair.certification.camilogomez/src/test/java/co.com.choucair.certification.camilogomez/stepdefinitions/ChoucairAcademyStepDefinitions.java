package co.com.choucair.certification.camilogomez.stepdefinitions;

import co.com.choucair.certification.camilogomez.questions.Answer;
import co.com.choucair.certification.camilogomez.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than camilo wants to register on page$")
    public void thanCamiloWantsToRegisterOnPage(){
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));
    }
    @When("^he register on page$")
    public void heRegisterOnPage(){
        OnStage.theActorInTheSpotlight().attemptsTo(Step1.onThePage(), Step2.onThePage(), Step3.onThePage(), Step4.onThePage());
    }
    @Then("^Then he can login on the page$")
    public void thenHeCanLoginOnThePage(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("employee")));
    }
}
