package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.ISeeThreeOptionsForInvesting;
import co.edu.udea.certification.questions.IsSuccessfulOperation;
import co.edu.udea.certification.tasks.*;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateNewAcademicUnitStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor admin = Actor.named("LosSuperConocidos");

    /*@Before
    public void preStage(){
        /*driver.manage().window().maximize();
        investor.can(BrowseTheWeb.with(driver));
    }*/

    @Given("I am in the home page of PLA 1")
    public void iAmInTheHomePageCreateNewAcademicUnit(){
        // We maximize the window
        driver.manage().window().maximize();

        // The investor can surf through the browser
        admin.can(BrowseTheWeb.with(driver));
    }

    @When("I go to academic unit form and fill it")
    public void fillAcademicUnitForm(){
        admin.attemptsTo(GoToAcademicUnitFormAndFill.solve(new UsuarioPage()));
    }

    @Then("I can save a new academic unit")
    public void saveNewAcademicUnit(){
        //admin.should(seeThat(ISeeThreeOptionsForInvesting.verify(),equalTo(true)));
        admin.should(seeThat(IsSuccessfulOperation.verify(),equalTo(true)));
    }
}
