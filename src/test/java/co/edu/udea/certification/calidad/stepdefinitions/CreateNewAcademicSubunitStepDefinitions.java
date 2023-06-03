package co.edu.udea.certification.calidad.stepdefinitions;

import co.edu.udea.certification.questions.IsSuccessfulOperation;
import co.edu.udea.certification.tasks.GoToAcademicSubunitFormAndFill;
import co.edu.udea.certification.tasks.GoToAcademicUnitFormAndFill;
import co.edu.udea.certification.userinterfaces.UsuarioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateNewAcademicSubunitStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor admin = Actor.named("LosSuperConocidos");

    @Given("I am in the home page of PLA 2")
    public void iAmInTheHomePageCreateNewAcademicSubunit(){
        // We maximize the window
        driver.manage().window().maximize();

        // The investor can surf through the browser
        admin.can(BrowseTheWeb.with(driver));
    }

    @When("I link a new academic subunit to an academic unit")
    public void fillAcademicSubunitForm(){

        admin.attemptsTo(GoToAcademicSubunitFormAndFill.solve(new UsuarioPage()));
    }

    @Then("I can save the new academic subunit")
    public void saveNewAcademicSubunit(){
        admin.should(seeThat(IsSuccessfulOperation.verify(),equalTo(true)));
    }
}
