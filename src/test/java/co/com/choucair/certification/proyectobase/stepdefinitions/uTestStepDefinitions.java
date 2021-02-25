package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.uTestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.JoinToday;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

  /*  @Given("^Rose wants to register on the uTest platform$")
    public void roseWantsToRegisterOnTheUTestPlatform() {
         OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^she registers all the data requested by the platform$")
    public void sheRegistersAllTheDataRequestedByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrFirstName(),
                        academyChoucairData.get(0).getStrLastName(),academyChoucairData.get(0).getStrEmail(),
                        academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                        academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrpassword(),
                        academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZip(),
                        academyChoucairData.get(0).getStrAddress(),academyChoucairData.get(0).getStrState(),
                         academyChoucairData.get(0).getStrPhoneMobile()
                        )
                );
    }
*/

    @Given("^Rose wants to register on the platform quickly$")
    public void roseWantsToRegisterOnThePlatformQuickly() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }


    @When("^she registers all the data required by the platform$")
    public void sheRegistersAllTheDataRequiredByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrpassword(),
                academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZip(),
                academyChoucairData.get(0).getStrAddress(),academyChoucairData.get(0).getStrState(),
                academyChoucairData.get(0).getStrPhoneMobile(), 1
                )
        );
    }

    @Then("^she will be registered$")
    public void sheWillBeRegistered() {
    }

    @Given("^Rose wants to register on the platform completely$")
    public void roseWantsToRegisterOnThePlatformCompletely() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^she registers all the data requested by the platform$")
    public void sheRegistersAllTheDataRequestedByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrpassword(),
                academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZip(),
                academyChoucairData.get(0).getStrAddress(),academyChoucairData.get(0).getStrState(),
                academyChoucairData.get(0).getStrPhoneMobile(), academyChoucairData.get(0).getStrTitle(),
                academyChoucairData.get(0).getStrAddress2(),academyChoucairData.get(0).getStrAditInfor(),
                academyChoucairData.get(0).getStrHomePhone(),academyChoucairData.get(0).getStrCompania(), 1
                )
        );
    }


    @Given("^Rose wants to register on the platform without mandatory data$")
    public void roseWantsToRegisterOnThePlatformWithoutMandatoryData() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }


    @When("^she registers if the data required by the platform$")
    public void sheRegistersIfTheDataRequiredByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrEmail()));
    }

    @Then("^she will not be able to register$")
    public void sheWillNotBeAbleToRegister() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }

}
/*

    ________________



    @Given("^Rose wants to register on the platform quickly$")
    void roseWantsToRegisterOnThePlatformQuickly() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }


    @When("^she registers all the data required by the platform$")
    public void sheRegistersAllTheDataRequiredByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrpassword(),
                academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZip(),
                academyChoucairData.get(0).getStrAddress(),academyChoucairData.get(0).getStrState(),
                academyChoucairData.get(0).getStrPhoneMobile(), Boolean.valueOf("True")
                )
        );


    }
    @Then("^she will be registered$")
    public void sheWillBeRegistered() {
    }

    @Given("^Rose wants to register on the platform completely$")
    public void roseWantsToRegisterOnThePlatformCompletely() {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }
    @When("^she registers all the data requested by the platform$")
    public void sheRegistersAllTheDataRequestedByThePlatform(List<uTestData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.the(academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),academyChoucairData.get(0).getStrpassword(),
                academyChoucairData.get(0).getStrCity(),academyChoucairData.get(0).getStrZip(),
                academyChoucairData.get(0).getStrAddress(),academyChoucairData.get(0).getStrState(),
                academyChoucairData.get(0).getStrPhoneMobile(), academyChoucairData.get(0).getStrTitle(),
                academyChoucairData.get(0).getStrAddress2(),academyChoucairData.get(0).getStrAditInfor(),
                academyChoucairData.get(0).getStrHomePhone(),academyChoucairData.get(0).getStrCompania(), Boolean.valueOf("false")
                )
        );
    }
*/
